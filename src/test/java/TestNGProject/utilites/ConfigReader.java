package TestNGProject.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String getProperty(String key){
        Properties properties=new Properties();


        try {
            FileInputStream fis=new FileInputStream("configuration.properties");
            properties.load(fis);

        } catch (IOException e) {
            System.out.println("Dosya Yolu bulunamadı veya okunamadı");
        }

        return properties.getProperty(key);
    }
}
