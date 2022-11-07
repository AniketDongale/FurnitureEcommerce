package com.shoping.service;

import com.shoping.repository.OrderRepository;
import com.shoping.repository.ProductRepository;
import com.shoping.repository.UserRepository;
import com.shoping.exception.OrderNotFoundException;
import com.shoping.Entity.Orders;
import com.shoping.Entity.Product;
import com.shoping.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class  OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;

    public void addOrder(Orders orders){
        orderRepository.save(orders);
    }
    public List<Orders> getAllOrders(){
        return orderRepository.findAll();
    }
    public  void deleteOrder(int orderId, long userId){

        User user = userRepository.findById(userId).get();
        Orders orders = orderRepository.findById(orderId).get();
        user.removeOrders(orders);
        userRepository.save(user);
        orderRepository.deleteById(orderId);



    }

    public void placeOrder(int orderId, int productId) {
        Orders orders= orderRepository.findById(orderId).get();
        Product product= productRepository.findById(productId).get();
        orders.putProduct(product);
        orderRepository.save(orders);
    }

    public void addUser(int orderId, long userId) {
        Orders orders= orderRepository.findById(orderId).get();
        User users= userRepository.findById(userId).get();
        orders.setUsers(users);
        orderRepository.save(orders);
    }

    public List<Orders> getOrderByUserId(long id) {
        User user = userRepository.findById(id).get();
        List <Orders> orders = user.getOrders();


        return orders;
    }

    public Orders getOrderById(int oId) {

        Optional<Orders> orders= orderRepository.findById(oId);
        if(orders.isPresent()){
            Orders o=orderRepository.findById(oId).get();
            return o;
        }
        else {
            throw new OrderNotFoundException("order not found");
        }

    }
}