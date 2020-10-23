/**
 * @Author:Otosun Tarih :22/10/2020
 */
package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_GetColumnAllData {
    public static void main(String[] args) {

        System.out.println(getData(2).toString());
    }

    static List<String> getData(int colonNu) {
        List<String> lst = new ArrayList<>();

        String path = "src/main/resources/sorguDosyasi.xlsx";
        Workbook workbook = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Sheet sheet = workbook.getSheetAt(0);
        int numberOfRows = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < numberOfRows; i++) {
            if(!(sheet.getRow(i).getCell(colonNu)==null)) {
                lst.add(sheet.getRow(i).getCell(colonNu).toString());
            }
            else lst.add("");
        }
        return lst;
    }

    public static String kullanicidanVeriAl(String ekranYazisi) {
        Scanner oku = new Scanner(System.in);
        System.out.print(ekranYazisi + ": ");
        String str = oku.nextLine();
        return str;
    }
}
