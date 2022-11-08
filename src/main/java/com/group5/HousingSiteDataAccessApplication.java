package com.group5;

import com.group5.service.UserImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

@SpringBootApplication
public class HousingSiteDataAccessApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(HousingSiteDataAccessApplication.class, args);

    }

}
