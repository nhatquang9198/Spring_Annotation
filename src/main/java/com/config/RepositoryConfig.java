package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.daos.InfoDao;
import com.entities.Info;

@Configuration
@Import({ InfoDao.class, Info.class })
public class RepositoryConfig {

}
