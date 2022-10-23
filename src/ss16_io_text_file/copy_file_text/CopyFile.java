package ss16_io_text_file.copy_file_text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class CopyFile {
    public static void copyFiles(String filePath, String fileTargetName) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter buffered = new BufferedWriter(new FileWriter(fileTargetName))) {
            File sourceFile = new File(filePath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            String line = "";
            while ((line = reader.readLine()) != null) {
                buffered.write(reader.readLine());
                buffered.newLine();
            }
            buffered.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int countCharacter(String sourcePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
        int count = 0;
        while (reader.read() != -1) {
            count++;
        }
        return count;
    }

}


