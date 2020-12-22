/**
 * @Author:Otosun Tarih :12/11/2020
 */
package JDBC.Gun02;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllColumn extends _Parent {

    @Test
    public void Test1() throws SQLException {
        ResultSet rs = statement.executeQuery(("select * from film"));
        ResultSetMetaData rsmd=rs.getMetaData();
        int columnCount=rsmd.getColumnCount();
        System.out.println(columnCount);
        while (rs.next()){
            for (int i=1;i<=columnCount;i++){
                System.out.print(rs.getString(i)+"  ");
            }
            System.out.println();
        }
    }

}
