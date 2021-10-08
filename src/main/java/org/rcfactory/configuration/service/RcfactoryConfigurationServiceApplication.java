package org.rcfactory.configuration.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RcfactoryConfigurationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RcfactoryConfigurationServiceApplication.class, args);
    }

}
