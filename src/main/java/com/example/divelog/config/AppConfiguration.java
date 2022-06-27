package com.example.divelog.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({MyServiceProperties.class,SiteProperties.class}) //실행될떄 바로 스프링 Configuration으로 자동등록
//@ConfigurationPropertiesScan도 가능
public class AppConfiguration {
}
