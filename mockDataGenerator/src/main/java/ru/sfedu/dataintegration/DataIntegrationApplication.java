package ru.sfedu.dataintegration;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import ru.sfedu.dataintegration.util.ConfigurationUtil;
import ru.sfedu.dataintegration.util.MockDataWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataIntegrationApplication {
    public static void main(String[] args) {
        try {
            File jarPath=new File(DataIntegrationApplication.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            String dir =jarPath.getParentFile().getAbsolutePath();
            String propertiesPath = dir + "\\mockDataGenerator.properties";
            System.out.println(" propertiesPath - " + propertiesPath);

            Properties mainProperties = new Properties();
            FileInputStream file;
            file = new FileInputStream(propertiesPath);
            mainProperties.load(file);
            file.close();

            String customer_1_filePath = mainProperties.getProperty("customer_1_file_path");
            String customer_2_folder_path = mainProperties.getProperty("customer_2_folder_path");

            // default value
            if(customer_1_filePath != null && !customer_1_filePath.isEmpty()){
                if(!customer_1_filePath.endsWith(".csv")) {
                    customer_1_filePath = "customer1.csv";
                }
            } else {
                customer_1_filePath = "customer1.csv";
            }

            MockDataWriter.generateCustomer1Data(customer_1_filePath);

            // default value
            if(customer_2_folder_path == null || customer_2_folder_path.isEmpty()){
                customer_2_folder_path = dir + "\\customer2";
            }

            MockDataWriter.generateCustomer2Data(customer_2_folder_path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
