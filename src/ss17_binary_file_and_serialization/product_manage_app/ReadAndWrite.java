package ss17_binary_file_and_serialization.product_manage_app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {

    public static void write(List<Product> list, String filepath) {
        File file = new File(filepath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(filepath))) {
            stream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> read(String filepath) {
        List<Product> products = new ArrayList<>();
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(filepath))) {
            products = (List<Product>) stream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
