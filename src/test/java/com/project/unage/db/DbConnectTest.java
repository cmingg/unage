package com.project.unage.db;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectTest {

    private static final String Driver = "oracle.jdbc.OracleDriver";
    private static final String Url = "jdbc:oracle:thin:@localhost:1521/xe";
    private static final String User = "hr";
    private static final String Password = "hr";

    @Test
    public void connectionTest() throws Exception {

        Class.forName(Driver);

        try (Connection conn = DriverManager.getConnection(Url, User, Password)) {
            if (conn != null) {
                System.out.println("DB 연결 성공!");
                System.out.println("conn = " + conn);
            } else {
                System.out.println("DB 연결 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
