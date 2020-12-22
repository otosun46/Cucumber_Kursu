/**
 * @Author:Otosun Tarih :16/11/2020
 */
package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {
    public static List<List<String>> getData(String dataBase, String query) {
        List<List<String>> lst = new ArrayList<>();
        String URL = "jdbc:mysql://test.medis.mersys.io:33306/"+dataBase;
        String username = "technostudy";
        String password = "zhTPis0l9#$&";

        try {
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery((query));
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            while (rs.next()) {
                List<String> lstRow = new ArrayList<>();
                for (int i = 1; i <= columnCount; i++) {
                    lstRow.add(rs.getString(i));
                }
                lst.add(lstRow);
            }
            connection.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lst;
    }
}
