package com.app.loginpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class LoginPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginPageApplication.class, args);
    }

}
