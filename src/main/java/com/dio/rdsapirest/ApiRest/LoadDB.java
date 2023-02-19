package com.dio.rdsapirest.ApiRest;

import com.dio.rdsapirest.ApiRest.entity.Employee;
import com.dio.rdsapirest.ApiRest.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDB {
    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);
    private final String MSG1 = "Log of event save user 1: ";
    private final String MSG2 = "Log of event save user 2: ";
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            log.info(MSG1, repository.save(new Employee("Maria Silva")));
            log.info(MSG2, repository.save(new Employee("John Dutra")));
        };
    }
}
