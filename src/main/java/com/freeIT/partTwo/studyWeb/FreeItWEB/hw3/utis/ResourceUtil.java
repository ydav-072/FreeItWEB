package com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.utis;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ResourceUtil {
//    private ResourceBundle resourceBundle = ResourceBundle.getBundle("connection.properties");
//    private String db_driver = resourceBundle.getString("db_driver");
//    private String db_uri = resourceBundle.getString("db_url");
//    private String user = resourceBundle.getString("user");
//    private String password = resourceBundle.getString("password");
    private String db_driver;
    private String db_uri;
    private String user;
    private String password;

    public void getProp() {
        FileInputStream fis;
        Properties property = new Properties();

        try {
            fis = new FileInputStream("C:/Users/admin/IdeaProjects/FreeItWEB/src/main/resources/connection.properties");
            property.load(fis);

            db_driver = property.getProperty("db_driver");
            db_uri = property.getProperty("db_url");
            user = property.getProperty("user");
            password = property.getProperty("password");

            System.out.println("HOST: " + db_uri
                    + ", LOGIN: " + user
                    + ", PASSWORD: " + password);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }

    public ResourceUtil() {
        this.getProp();
    }

    public String getDb_driver() {
        return db_driver;
    }

    public String getDb_uri() {
        return db_uri;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

}
