package JAVA_practice.Chapter8;

import java.io.*;
import java.util.Scanner;

public class BufferedIO_Test {
    public static void main(String [] args){
        FileReader fr = null;
        int c;
        try{
            fr = new FileReader("intelliJ/textFiles/test2.txt");
            BufferedOutputStream bo = new BufferedOutputStream(System.out, 5);

            while((c = fr.read()) != -1){
                bo.write(c);
            }

            new Scanner(System.in).nextLine();
            bo.flush(); // 버퍼에 남아있던 문자 모두 출력
            fr.close();
            bo.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
