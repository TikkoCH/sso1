package com.ticky.sso.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.provider.endpoint.WhitelabelApprovalEndpoint;

/**
 * 单点登录 服务端
 *
 * @author Ticky
 * @Created on 2018-11-11 10:23.
 */
@SpringBootApplication
public class SsoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsoServerApplication.class,args);
    }
}
