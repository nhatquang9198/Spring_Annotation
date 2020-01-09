package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.services.InfoServiceImpl;
import com.services.PersonServiceImpl;

@Configuration
@Import({ PersonServiceImpl.class, InfoServiceImpl.class })
public class ServiceConfig {

}
