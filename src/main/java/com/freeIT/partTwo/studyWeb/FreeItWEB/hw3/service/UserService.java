package com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.service;

import com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.entity.User;

public class UserService {
    private static boolean flag = true;

    public static boolean isEmpty(User user){
        if (user.getId() != 0 && user.getLogin() != null && user.getPassword() != null && user.getName() != null){
            return flag;
        } else
            return !flag;
    }
}
