package ss16_io_text_file.copy_file_text;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println(CopyFile.copyFiles("testfile.txt","copyfiletest.txt"));
        System.out.println("Count character: " + CopyFile.countCharacter("testfile.txt"));
    }
}
