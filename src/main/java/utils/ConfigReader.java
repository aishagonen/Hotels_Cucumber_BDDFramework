package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties configFile;

    static {
        FileInputStream reader;
        String propertyFilePath = "configs/config.properties";
        try {
            reader = new FileInputStream(propertyFilePath);
            configFile = new Properties();
            try {
                configFile.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public static String getReportConfigPath(){
        String reportConfigPath = configFile.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

    public static String getProperty(String key){
        return configFile.getProperty(key);
    }


}