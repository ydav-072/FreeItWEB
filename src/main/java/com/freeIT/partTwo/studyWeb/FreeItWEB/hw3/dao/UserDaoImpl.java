package com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.dao;

import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.entity.User;
import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.service.UserService;
import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.utis.ConnectionUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDaoInterface {
    @Override
    public void createUser(User user) {
        try {
            PreparedStatement preparedStatement = ConnectionUtil.getConnection().
                    prepareStatement("INSERT INTO user_info.users (login, password, user_name) VALUES (?, ?, ?)");
            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getName());
            preparedStatement.execute();
        } catch (SQLException sqlException) {
            System.out.println();
            sqlException.printStackTrace();
        }
    }

    @Override
    public User readUserByLogin(String login) {
        User user = new User();
        try {
            PreparedStatement preparedStatement = ConnectionUtil.getConnection().
                    prepareStatement("SELECT * FROM user_info.users WHERE login = (?)");
            preparedStatement.setString(1, login);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user.setLogin(resultSet.getString("login"));
                user.setName(resultSet.getString("user_name"));
                user.setPassword(resultSet.getString("password"));
                user.setId(Integer.parseInt(resultSet.getString("id")));
            }
        } catch (SQLException sqlException) {
            System.out.println("Can't read User by ID");
            sqlException.printStackTrace();
        }
        return user;
    }

    @Override
    public void updateUserById(User user) {
        try {
            PreparedStatement preparedStatement = ConnectionUtil.getConnection().
                    prepareStatement("UPDATE user_info.users SET user_name= ?, password= ? WHERE id = ?");
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, String.valueOf(user.getId()));
            preparedStatement.execute();
        } catch (SQLException sqlException) {
            System.out.println("Can't update user with id: " + user.getId());
            sqlException.printStackTrace();
        }
    }

    @Override
    public void deleteUserByLogin(String login) {
        User userForDelete;
        try {
            userForDelete = readUserByLogin(login);
            if (UserService.isEmpty(userForDelete)) {
                System.out.println("Not found user with this id :((");
            } else {
                PreparedStatement preparedStatement = ConnectionUtil.getConnection().
                        prepareStatement("DELETE FROM user_info.users WHERE id = ?");
                preparedStatement.setString(1, login);
                preparedStatement.execute();
            }
        } catch (SQLException sqlException) {
            System.out.println("Can't delete user with id: " + login);
            sqlException.printStackTrace();
        }
    }
}
