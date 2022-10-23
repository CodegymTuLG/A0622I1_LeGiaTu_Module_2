package ss16_io_text_file.read_csv_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static List<CountryName> readFile(String filename) {
        List<CountryName> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(new CountryName(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void writeFile(List<CountryName> countryNames, String filename) {
        BufferedWriter buffered = null;
        try {
            buffered = new BufferedWriter(new FileWriter(filename));
            for (CountryName countries: countryNames) {
                buffered.write(countries.getInfo());
                buffered.newLine();
            }
            buffered.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (buffered != null) {
                try {
                    buffered.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
