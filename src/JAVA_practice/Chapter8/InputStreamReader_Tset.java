package JAVA_practice.Chapter8;

import java.io.*;

public class InputStreamReader_Tset {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try{
            fin = new FileInputStream("intelliJ/textFiles/hangul.txt");
            in = new InputStreamReader(fin, "UTF-8");
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char)c);
            }
            in.close();
            fin.close();
        } catch (IOException e) { //예외 처리
            System.out.println("입출력 오류");
        }
    }
}
