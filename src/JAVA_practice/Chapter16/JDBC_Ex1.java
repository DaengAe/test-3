package JAVA_practice.Chapter16;

import java.sql.*;

public class JDBC_Ex1 {
    public static void main(String[] args){
        Statement stmt;
        Connection conn;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampleDB", "root", "dsa991006!");
            System.out.println("DB 연결 완료");

            stmt = conn.createStatement();
            //insert
            stmt.executeUpdate("insert into student (name, id, dept) values('임은택', '0010077', '정보통신');");
            printTable(stmt);
            //update
            stmt.executeUpdate("update student set id='1234567' where name='임은택'");
            printTable(stmt);
            //delete
            stmt.executeUpdate("delete from student where name='임은택'");
            printTable(stmt);

            conn.close();
            stmt.close();

        }catch(ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 에러");
            e.printStackTrace();
        }catch (SQLException e) {
            System.out.println("DB 연결 오류");
            e.printStackTrace();
        }
    }

    private static void printTable(Statement stmt) throws  SQLException {
        ResultSet srs = stmt.executeQuery("select * from student");
        while (srs.next()) {

            System.out.print(srs.getString("name"));
            System.out.print("\t|\t" + srs.getString("id"));
            System.out.println("\t|\t" + srs.getString("dept"));
        }
        System.out.println();

        srs.close();
    }
}
