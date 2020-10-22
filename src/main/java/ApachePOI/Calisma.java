/**
 * @Author:Otosun Tarih :22/10/2020
 */
package ApachePOI;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {
        System.out.println(getData(kullanicidanVeriAl("Sorgu kelimesini yaziniz")));
    }

    static String getData(String search) {
        String data = "";
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
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(search)) {
                int numberOfCells = sheet.getRow(i).getPhysicalNumberOfCells();
                for (int j = 1; j < numberOfCells; j++) {
                    data += sheet.getRow(i).getCell(j) + " ";
                }
                break;
            }
        }
        return data;
    }

    public static String kullanicidanVeriAl(String ekranYazisi) {
        Scanner oku = new Scanner(System.in);
        System.out.print(ekranYazisi + ": ");
        String str = oku.nextLine();
        return str;
    }
}
