package com.mikebishop.sycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.IOException;

@SpringBootApplication
public class SycleApplication implements ApplicationContextAware, CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SycleApplication.class);

    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(SycleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        SycleShell shell = context.getBean(SycleShell.class);
        try {
            shell.runShell();
        }
        catch (IOException e) {
            log.error("Error encountered while running Sycle shell", e);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
