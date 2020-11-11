/**
 * @Author:Otosun Tarih :11/11/2020
 */
package JDBC.Gun01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.*;

public class _02_BeforeAfter {

    private Connection connection;
    private Statement statement;

    @BeforeTest
    public void beforeTest() throws SQLException {
        String URL="jdbc:mysql://test.medis.mersys.io:33306/sakila"; // Veri tabanina ulasabilmek icin JBDS ye db nin tipi (mysql)
        //db nin yolu, mysql port numarasi ve db nin adi veriliyor.
        String username= "technostudy";
        String password= "zhTPis0l9#$&";

        connection= DriverManager.getConnection(URL,username,password);// baglanti saglandi
        statement= connection.createStatement();//sorgularimi calistirabilmek icin bir yol olustur
    }

    @AfterTest
    public void afterTest() throws SQLException {
        connection.close();
    }

    @Test
    public void Test1() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from language");
        rs.next();
        String name=rs.getString("name");
        System.out.println(name);

        rs.next();
        name=rs.getString("name");
        System.out.println(name);

        rs.next();
        name=rs.getString("name");
        System.out.println(name);

    }
}
