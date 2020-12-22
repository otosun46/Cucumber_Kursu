/**
 * @Author:Otosun Tarih :12/11/2020
 */
package JDBC.Gun02;

import JDBC._Parent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_SqlExample extends _Parent {
    @Test
    public  void relativeExemple() throws SQLException {
        ResultSet rs = statement.executeQuery(("select * from city"));
        rs.relative(5);
        String cityName = rs.getString(2);
        System.out.println(cityName);

        rs.relative(6);
        cityName = rs.getString(2);
        System.out.println(cityName);
    }

    @Test
    public  void lastFirstKeyword() throws SQLException {
        ResultSet rs = statement.executeQuery(("select * from city"));
        rs.last();
        String cityName = rs.getString("city");
        Integer countryId=rs.getInt("country_id");

        System.out.println(cityName+"--"+countryId);

        rs.first();
       cityName = rs.getString("city");
       countryId=rs.getInt("country_id");

        System.out.println(cityName+"--"+countryId);
    }

    @Test
    public  void districtExemple() throws SQLException {
        ResultSet rs = statement.executeQuery(("select * from address"));
        rs.absolute(10);
        String districtName = rs.getString("district");
        System.out.println(districtName);

        rs.absolute(22);
        districtName = rs.getString("district");
        System.out.println(districtName);

        rs.last();
        districtName = rs.getString("district");
        System.out.println(districtName);
    }

}
