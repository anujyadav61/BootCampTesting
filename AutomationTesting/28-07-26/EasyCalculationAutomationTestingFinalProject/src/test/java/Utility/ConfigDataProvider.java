package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

    private Properties pro;

    public ConfigDataProvider() {

        pro = new Properties();

        File src = new File("./Configuration/config.properties");

        try {

            FileInputStream fis = new FileInputStream(src);

            pro.load(fis);

            fis.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public String getBrowser() {

        return pro.getProperty("browser");

    }

    public String getUrl() {

        return pro.getProperty("url");

    }

    public String getAgeCalculatorUrl() {

        return pro.getProperty("ageCalculatorUrl");

    }

}