package JAVA_practice.Chapter8;

import java.io.*;
import java.util.Scanner;

public class FileWriter_Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;
        int c;
        try{
            fw = new FileWriter("intelliJ/textFiles/test.txt");
            while(true) {
                String line = sc.nextLine();
                if(line.length() == 0){
                    break;
                }
                fw.write(line, 0, line.length());
                fw.write("\r\n", 0, 2); //한 줄 띄기 위함.
            }
            fw.close();
        }catch (IOException e){
            System.out.println("입출력 오류");
        }
        sc.close();
    }
}
