/**
 * @Author:Otosun Tarih :12/11/2020
 */
package JDBC.Gun02;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_GetAllRow extends _Parent {
    @Test
    public void districtExemple() throws SQLException {
        ResultSet rs = statement.executeQuery(("select * from customer"));
        int rowCount = 0;
        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            System.out.printf("%4d %-10s %-15s \n", rs.getRow(), firstName, lastName);
            rowCount++;
        }
        System.out.println("Kayit miktari=" + rowCount);
        rs.last();
        System.out.println(rs.getRow());

    }

    @Test
    public void ExempleFor() throws SQLException {
        ResultSet rs = statement.executeQuery(("select * from customer"));
        int rowCount = 0;
        rs.last();
        int kayitSayisi = rs.getRow();
        for (int i = 1; i <= kayitSayisi; i++) {
            rs.absolute(i);
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            System.out.printf("%4d %-10s %-15s \n", rs.getRow(), firstName, lastName);
            rowCount++;
        }
        System.out.println("Kayit miktari=" + rowCount);
// **********Farkli yontemler *************************
//        rs.first();
//        for (int i = 1; i <= rowCount; i++) {
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString("last_name");
//
//            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
//            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());
//
//            rs.next();
//        }


//        for (int i = 1; i <= rowCount; i++) {
//            rs.absolute(i);
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString("last_name");
//
//            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
//            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());
//        }


//        for (int i = rowCount; i > 0; i--) { // sondan başa doğru
//            String firstName = rs.getString("first_name");
//            String lastName = rs.getString("last_name");
//
//            //System.out.println(firstName + " -- " + lastName + " -- "+ rs.getRow());
//            System.out.printf("%-15s %-15s %-4d\n", firstName, lastName, rs.getRow());
//
//            rs.next();
//        }
    }
}
