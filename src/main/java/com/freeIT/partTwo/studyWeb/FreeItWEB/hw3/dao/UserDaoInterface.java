package com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.dao;

import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.entity.User;

public interface UserDaoInterface {
    //CRUD
    void createUser(User user);
    User readUserByLogin(String login);
    void updateUserById(User user);
    void deleteUserByLogin(String login);
}
