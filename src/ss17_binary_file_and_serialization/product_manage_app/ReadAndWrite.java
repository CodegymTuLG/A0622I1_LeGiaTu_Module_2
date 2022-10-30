package ss17_binary_file_and_serialization.product_manage_app;

import java.io.*;
import java.util.Collection;
import java.util.Collections;

public class ReadAndWrite {

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
        File file = new File(filepath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(filepath))) {
            return (Collection) stream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
