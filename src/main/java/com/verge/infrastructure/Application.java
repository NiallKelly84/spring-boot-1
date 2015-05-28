package com.verge.infrastructure;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static org.springframework.data.repository.query.QueryLookupStrategy.Key.*;

@SpringBootApplication
@EnableJpaRepositories(value = "com.verge.repository", queryLookupStrategy = CREATE_IF_NOT_FOUND)
@EntityScan("com.verge.entity")
@ComponentScan({"com.verge"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        migrateDB();
    }

    private static void migrateDB() {
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://localhost/spring", "root", null);
        flyway.migrate();
    }
}
