package com.freeIT.partTwo.studyWeb.FreeItWEB.hw3.utis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static ResourceUtil resourceUtil = new ResourceUtil();
    private static Connection connection = null;


    public static Connection getConnection(){
        try{
            Class.forName(resourceUtil.getDb_driver());
            connection = DriverManager.getConnection(resourceUtil.getDb_uri(), resourceUtil.getUser(),
                    resourceUtil.getPassword());
            return connection;
        }catch (SQLException | ClassNotFoundException sqlException){
            System.out.println("Some err in connection to Data base");
            sqlException.printStackTrace();
        }
        return connection;
    }

    public static void stopConnection(Connection connection){
        try{
            connection.close();
        }catch (SQLException sqlException){
            System.out.println("Can't close connection");
            sqlException.printStackTrace();
        }
    }
}