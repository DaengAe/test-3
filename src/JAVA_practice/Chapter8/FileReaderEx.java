package JAVA_practice.Chapter8;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String [] args){
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("intelliJ/textFiles/file.txt");
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char)c);
            }
            fileReader.close();
        }
        catch (IOException e){ //예외 처리
            System.out.println("입출력 오류");
        }
    }
}

