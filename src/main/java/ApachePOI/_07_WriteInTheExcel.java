/**
 * @Author:Otosun Tarih :22/10/2020
 */
package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _07_WriteInTheExcel {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/WriteInTheExcelFile.xlsx";
        Workbook workbook = null;
        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Merhaba Dunya");
        fileInputStream.close();

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
