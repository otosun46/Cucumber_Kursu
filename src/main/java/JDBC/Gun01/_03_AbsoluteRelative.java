/**
 * @Author:Otosun Tarih :11/11/2020
 */
package JDBC.Gun01;

import JDBC._Parent;
import org.testng.annotations.Test;
import java.sql.*;

public class _03_AbsoluteRelative extends _Parent {

    @Test
    public void Test1() throws SQLException {
        ResultSet rs=statement.executeQuery("select * from film");
        rs.absolute(10); //verilen satira gider
        String title=rs.getString("title");
        System.out.println(title);

        rs.absolute(15);
        title=rs.getString("title");
        System.out.println(title);

        rs.relative(5);
        title=rs.getString("title");
        System.out.println(title);

        rs.relative(-5);
        title=rs.getString("title");
        System.out.println(title);
    }
}
