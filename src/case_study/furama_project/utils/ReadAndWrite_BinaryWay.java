package case_study.furama_project.utils;

import java.io.*;
import java.util.Collection;

public class ReadAndWrite_BinaryWay {

    public static void write(Collection collections, String filepath) {
        File file = new File(filepath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(filepath))) {
            stream.writeObject(collections);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Collection read(String filepath) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(filepath))) {
            return (Collection) stream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
