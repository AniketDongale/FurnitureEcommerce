package service;

import com.furniture.Repository.ProductRepository;
import com.furniture.model.Product;
import com.furniture.service.ProductService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.DisplayName;



import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;



import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    @InjectMocks
    private ProductService productService;
    private Product product;


    @BeforeEach
    void setUp() {
        //this.productService=new ProductService(this.productRepository);

        Product product= new Product(5,"new product",199,"new img",false);
           
    }
    @Test
    void getAllProducts() {
        productService.getAllProducts();
        verify(productRepository).findAll();

    }
    @Test
    void testCreateProduct(){



        Mockito.when(productRepository.save(product)).thenReturn(product);

        assertThat(productService.createProduct(product)).isEqualTo(product);

    }
//    @Test
//    void testDeleteProduct(){
//        Product product =  new Product();
//        product.setApproved(false);
//        product.setProductName("new Product");
//        product.setProductId(1);
//        product.setPrize(1999);
//        product.setImg("new Img");
//        Mockito.when(productRepository.getOne(1)).thenReturn((product));
//        Mockito.when(productRepository.exists(product.getProductId())).thenReturn(false);
//        assertFalse(productRepository.exists(product.getProductId()));
//    }

   // JUnit  test for delete Product method
    @DisplayName("JUnit test for deleteEmployee method")
    @Test
    public void deleteProductById(){
        int productId=1;
        willDoNothing().given(productRepository).deleteById(productId);
         productService.deleteProduct(productId);

         verify(productRepository,times(1)).deleteById(productId);
    }


}