package com.ticky.oa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * oa单点登录客户端
 *
 * @author Ticky
 * @Created on 2018-11-11 11:40.
 */
@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class Application {
    @GetMapping("/user")
     public Authentication user(Authentication user){
        return user;
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
