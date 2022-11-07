package com.group5.housing_site_data_access;

import com.group5.housing_site_data_access.Model.User;
import com.group5.housing_site_data_access.dataAccess.DBUser;
import com.group5.housing_site_data_access.service.UserImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HousingSiteDataAccessApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(HousingSiteDataAccessApplication.class, args);

        Server server = ServerBuilder
                .forPort(8080)
                .addService(new UserImpl()).build();

        server.start();
        server.awaitTermination();
    }

}
