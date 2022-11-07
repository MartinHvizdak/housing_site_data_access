package com.group5.housing_site_data_access;

import com.group5.housing_site_data_access.Model.User;
import com.group5.housing_site_data_access.dataAccess.DBConnection;
import com.group5.housing_site_data_access.dataAccess.DBUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;

@SpringBootApplication
public class HousingSiteDataAccessApplication {

    public static void main(String[] args) {
        DBUser dbUser = new DBUser();
        User user = dbUser.getUserById(1);

        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getSurname());
        System.out.println(user.getEmail());

    }

}
