package case_study.furama_project.utils;

import case_study.furama_project.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReadAndWrite {

    public static void write(List<Employee> collections, String filepath) {
        File file = new File(filepath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filepath, true))) {
            for (Employee cl: collections) {
                buffered.write(cl.getInfo());
                buffered.newLine();
            }
            buffered.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> read(String filepath) {
        List<Employee> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                list.add(new Employee(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
