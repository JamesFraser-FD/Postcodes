package ConfigManagement;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    private static final Properties config;

    static {
        config = new Properties();
        try {
            config.load(new FileReader("src/main/resources/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String baseUrl() {
        return config.getProperty("baseUrl");
    }
    public static String postcodeTestFileLocation() { return config.getProperty("postcodeTestFileLocation"); }

}
