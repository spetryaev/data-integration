package ru.sfedu.dataintegration.util;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import ru.sfedu.dataintegration.model.Customer1;
import ru.sfedu.dataintegration.model.Customer2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MockDataWriter {

    private static List<String> nameExamples = Arrays.asList(
            "Saturn", "Mars", "Mercury", "Venus", "Earth", "Phobos", "Deimos",
            "Gaspra", "Jupiter", "Uranus", "Neptune", "Pluto", "Haumea"
            );

    public static void generateCustomer1Data(String filePath) throws CsvRequiredFieldEmptyException, IOException, CsvDataTypeMismatchException {
        List<Customer1> customers1 = new ArrayList<>();
        Random random = new Random();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-YYYY");
        for(int i = 0; i < nameExamples.size(); i++){
            customers1.add(new Customer1(
                    nameExamples.get(random.nextInt(nameExamples.size())),
                    String.valueOf(random.nextInt(100) * 1024 * 1024),
                    LocalDate.now().format(formatter),
                    "City" + random.nextInt(100),
                    "Street" + random.nextInt(100),
                    String.valueOf(random.nextInt(100)))
            );
        }

        Writer writer = new FileWriter(filePath);
        StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
                .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                .build();
        sbc.write(customers1);
        writer.close();
    }

    public static void generateCustomer2Data() throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        Random random = new Random();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");

        for(int i = 0; i < nameExamples.size(); i++){
            Customer2 customer = new Customer2(
                    String.valueOf(random.nextInt(100) * 1024),
                    LocalDate.now().format(formatter),
                    "City" + random.nextInt(100)
                            + " Street" + random.nextInt(100)
                            + " " + random.nextInt(100)
            );

            Writer writer = new FileWriter( "customer2/" + nameExamples.get(i) + ".csv");
            StatefulBeanToCsv sbc = new StatefulBeanToCsvBuilder(writer)
                    .withSeparator(CSVWriter.DEFAULT_SEPARATOR)
                    .build();
            sbc.write(customer);
            writer.close();
        }


    }


}
