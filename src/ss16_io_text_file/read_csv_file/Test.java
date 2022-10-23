package ss16_io_text_file.read_csv_file;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<CountryName> countryNames = new ArrayList<>();
        countryNames.add(new CountryName(1,"AU","Australia"));
        countryNames.add(new CountryName(2,"CN","China"));
        countryNames.add(new CountryName(3,"AU","Australia"));
        countryNames.add(new CountryName(4,"CN","China"));
        countryNames.add(new CountryName(5,"JP","Japan"));
        countryNames.add(new CountryName(6,"CN","China"));
        countryNames.add(new CountryName(7,"JP","Japan"));
        countryNames.add(new CountryName(8,"TH","Thailand"));

        ReadCSV.writeFile(countryNames, "countrys.csv");

        List<CountryName> studentList = ReadCSV.readFile("countrys.csv");
        studentList.forEach(System.out::println);
    }
}
