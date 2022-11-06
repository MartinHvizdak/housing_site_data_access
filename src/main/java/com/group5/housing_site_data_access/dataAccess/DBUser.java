package com.group5.housing_site_data_access.dataAccess;

import com.group5.housing_site_data_access.Model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUser implements DBUserI{

    @Override
    public User getUserById(int id) {
        try (Connection connection = DBConnection.getDBConnection()) {

            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from user where Id = " + id);
            User user = null;

            while (resultSet.next()) {
                long Id = resultSet.getLong("Id");
                String Name = resultSet.getString("Name").trim();
                String Surname = resultSet.getString("Surname").trim();
                String Email = resultSet.getString("Email").trim();
                user = new User(Id, Name, Surname, Email);
            }
            resultSet.close();
            statement.close();
            connection.close();
            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
