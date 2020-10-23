/**
 * @Author:Otosun Tarih :22/10/2020
 */
package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/NewExcelFile.xlsx";
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Benim Sayfam");
        XSSFSheet sheet1=workbook.createSheet("Benim Sayfam1");
        Row row = sheet.createRow(0);
        Row row1 = sheet1.createRow(0);
        Cell cell = row.createCell(0);
        Cell cell1 = row1.createCell(0);
        cell.setCellValue("Merhaba Dunya");
        cell1.setCellValue("Merhaba Dunya1");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }


    public static String kullanicidanVeriAl(String ekranYazisi) {
        Scanner oku = new Scanner(System.in);
        System.out.print(ekranYazisi + ": ");
        String str = oku.nextLine();
        return str;
    }
}
