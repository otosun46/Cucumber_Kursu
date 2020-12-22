/**
 * @Author:Otosun Tarih :11/11/2020
 */
package JDBC;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class _Parent {
    public  Connection connection;
    public  Statement statement;

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
}
