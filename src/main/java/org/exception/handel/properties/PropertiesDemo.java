package org.exception.handel.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

    public void dbConnection() {

        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream("config.properties");
            properties.load(fileInputStream);

            String url = properties.getProperty("database.url");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");
            String port = properties.getProperty("port");

            System.out.println("URL: " + url);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Port: " + port);


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        PropertiesDemo propertiesDemo = new PropertiesDemo();
        propertiesDemo.dbConnection();
    }
}
