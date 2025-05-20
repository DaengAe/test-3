package JAVA_practice.Chapter8;

import java.io.*;

public class FileInputStream_Test {
    public static void main(String[] args){
        byte b[] = new byte [6]; // 비어있는 byte 배열
        try{
            FileInputStream fi = new FileInputStream("intelliJ/textFiles/test.out");
            int n=0, c;

            while((c = fi.read()) != -1){
                b[n] = (byte)c;
                n++;
            }
            System.out.println("해당 파일에서 읽은 배열을 출력합니다.");
            for(int i=0; i<b.length; i++){
                System.out.print(b[i] + " ");
            }
            System.out.println();
            fi.close();
        }catch (IOException e) {
            System.out.println("해당 파일에서 읽지 못했습니다. 경로명을 체크해보세요.");
        }
    }
}
