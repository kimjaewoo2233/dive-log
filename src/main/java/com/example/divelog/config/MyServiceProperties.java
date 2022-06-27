package com.example.divelog.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.net.InetAddress;
import java.security.Security;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties("my.service")  //yml파일에 값을 받아오기위해 변수들을 스프링빈으로 등록한것임
public class MyServiceProperties {  //이 클래스를 Configuration 으로 등록해줘야한다
    private boolean enabled;
    private InetAddress remoteAddress;
    private final Security security = new Security();

    public static class Security{
        private String username;
        private String password;
        private List<String> roles;
        private Map<String,Boolean> attrs;
    }
}
