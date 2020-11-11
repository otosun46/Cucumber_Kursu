/**
 * @Author:Otosun Tarih :11/11/2020
 */
package JDBC.Gun01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Giris {
    @Test
    public void Test1() throws SQLException {
        String URL="jdbc:mysql://test.medis.mersys.io:33306/sakila"; // Veri tabanina ulasabilmek icin JBDS ye db nin tipi (mysql)
                                                                        //db nin yolu, mysql port numarasi ve db nin adi veriliyor.
        String username= "technostudy";
        String password= "zhTPis0l9#$&";

        Connection connection= DriverManager.getConnection(URL,username,password);// baglanti saglandi
        Statement statement= connection.createStatement();//sorgularimi calistirabilmek icin bir yol olustur
        ResultSet rs= statement.executeQuery("select * from actor"); //calistirildi sonuclar rs degiskenine atandi
                // fakat performans icin butun sonuclar rs ye aktarilmiyor.  Biz komut verdikce ilerleyecek.
        rs.next(); // gostergeyi sonraki adima getir, orada satir varsa butun satiri rs ye at.


        String firstName=rs.getString("first_name");
        String lastName=rs.getString("last_name");
        System.out.println(firstName+" "+lastName);

        rs.next(); //
        firstName=rs.getString("first_name");
        lastName=rs.getString("last_name");
        System.out.println(firstName+" "+lastName);

    }
}
