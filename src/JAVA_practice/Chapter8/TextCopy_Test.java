package JAVA_practice.Chapter8;

import java.io.*;

public class TextCopy_Test {
    public static void main(String[] args){
        File src = new File("intelliJ/textFiles/file.txt"); //원본 파일 경로
        File dest = new File("intelliJ/textFiles/copy.txt"); //복사 파일 경로
        int c;

        try{
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dest);
            while((c=fr.read()) != -1) { //문자 하나 읽고
                fw.write((char)c); //문자 하나 쓰고
            }
            fr.close();
            fw.close();
            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        }
        catch (IOException e){
            System.out.println("파일 복사 오류");
        }
    }
}
