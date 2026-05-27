package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;
    private FileReader fileReader;

    public String configreader(String configValue) throws IOException {
        properties = new Properties();
        fileReader = new FileReader("C:\\Users\\x482984\\IdeaProjects\\FullFramework\\src\\test\\resources\\config.properties");
        properties.load(fileReader);
        return properties.getProperty(configValue);
    }
}
