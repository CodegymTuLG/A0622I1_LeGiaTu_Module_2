package case_study.furama_project.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void resetFile(String filepath){
        File file = new File(filepath);
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filepath, false))) {
            //
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeNew(String collection, String filepath){
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filepath, true))) {
            buffered.write(collection);
            buffered.newLine();
            buffered.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(String collection, String filepath) {
        File file = new File(filepath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedWriter buffered = new BufferedWriter(new FileWriter(filepath, true))) {
                buffered.write(collection);
                buffered.newLine();
            buffered.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> read(String filepath) {
        List<String[]> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(filepath)))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] stringArray = line.split(",");
                list.add(stringArray);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
