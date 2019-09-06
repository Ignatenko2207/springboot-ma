//package com.mainacad.config;
//
//import com.mainacad.dao.UserDAO;
//import com.mainacad.dao.connection.ConnectionFactory;
//import com.mainacad.dao.connection.H2Factory;
//import com.mainacad.dao.connection.PostgresFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.*;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@EnableSwagger2
//public class AppConfig {
//
//    @Bean()
//    @Profile("dev")
//    public ConnectionFactory getH2Factory() {
//        return new H2Factory();
//    }
//
//    @Bean()
//    @Profile("test")
//    public ConnectionFactory getPostgresFactory() {
//        return new PostgresFactory();
//    }
//
//
//    @Bean
//    public UserDAO getUserDAO(ConnectionFactory connectionFactory) {
//        UserDAO userDAO = new UserDAO();
//        userDAO.setConnectionFactory(connectionFactory);
//        return userDAO;
//    }
//}
