package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ ComponentConfig.class, RepositoryConfig.class, ServiceConfig.class })
public class AppConfig {

}
