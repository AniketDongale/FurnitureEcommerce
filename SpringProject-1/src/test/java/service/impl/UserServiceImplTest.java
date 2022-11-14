package service.impl;

import com.furniture.Repository.UserRepository;

import com.furniture.model.User;
import com.furniture.model.UserDto;
import com.furniture.service.impl.UserServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;


import java.util.Optional;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    private User user;
    private UserDto userDto;
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    private UserServiceImpl userService;
    @BeforeEach
    void setUp() {
        //this.productService=new ProductService(this.productRepository);

        User user= new  User(1L,"newUser","newPassword","newuser@gmail.com");
              
        UserDto userDto= new UserDto("newUser","newPassword","newuser@gmail.com");
                
    }


    @Test
    void loadUserByUsername() {
    }

    @Test
    void getUserByName() {
    }

    @Test
    void findAll() {

    }
   @DisplayName("Junit test for getUserById methode")
    @Test
    void findOne() {
        //given
        given(userRepository.findById(1L)).willReturn(Optional.of(user));

        //when
        User savedUser=userService.getUserById(user.getId());

        // then
        assertThat(savedUser).isNotNull();
    }
    @DisplayName("Junit test for saveEmployee method which throws exception")
    @Test
    void save() {
//            given(userRepository.findByUsername(u))
//                   .willReturn(user);
//
//            System.out.println(userRepository);
//            System.out.println(userService);
//
//           // when - action or the behaviour that we are going test
//        org.junit.jupiter.api.Assertions.assertThrows(UserNotFoundException.class,()->{
//            userService.save(userDto);
//        });
//
//        verify(userRepository,never()).save(any(User.class));
    }

    @Test
    void getAllUsers() {
    }

    @Test
    void getUserById() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void createUser() {
    }
}