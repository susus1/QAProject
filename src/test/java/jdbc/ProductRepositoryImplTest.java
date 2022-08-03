package jdbc;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import static org.junit.Assert.*;

public class ProductRepositoryImplTest {

    @Before
    public void setUp() throws Exception {
        String url = "jdbc:mysql://localhost:3306/ecommerce?useSSL=false&serverTimezone=UTC";
        String username = "root";
        String password = "carpond";
        String[] commands = {"use ecommerce;",
                "create table if not exists Product(id bigint not null auto_increment primary key, name varchar(255) not null, costPrice double, retailPrice double);",
                "truncate table product;"
        };
        try(Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            for (String command : commands) {
                statement.addBatch(command);
            }
            statement.executeBatch();
        }
    }

    @Test
    public void integrationTest(){
//        Product product1 = new Product("bread", 0.4, 1.2);
//        Product product2 = new Product("cheese", 0.9, 2.1);
//        ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
//
//        long id1 = productRepository.create(product1);
//        assertEquals(1L, id1);
//
//        long id2 = productRepository.create(product2);
//        assertEquals(2L, id1);



    }
}

