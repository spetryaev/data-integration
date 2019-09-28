package ru.sfedu.dataintegration;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import ru.sfedu.dataintegration.util.MockDataWriter;

import java.io.IOException;

public class DataIntegrationApplication {
    public static void main(String[] args) {
        try {
            MockDataWriter.generateCustomer1Data("customer1.csv");
            MockDataWriter.generateCustomer2Data();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
