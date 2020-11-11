/**
 * @Author:Otosun Tarih :26/10/2020
 */
package Utilities;

import cucumber.api.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {
    public static List<List<String>> getListData(String path, String sheetName, int colonCount) {
        List<List<String>> returnList = new ArrayList<>();
        Workbook workbook = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Sheet sheet = workbook.getSheet(sheetName);
        int numberOfRows = sheet.getPhysicalNumberOfRows();

        for (int i = 0; i < numberOfRows; i++) {
            List<String> rowList = new ArrayList<>();
            Row row = sheet.getRow(i);
            for (int j = 0; j < colonCount; j++) {
                if (!(sheet.getRow(i).getCell(j) == null)) {
                    rowList.add(row.getCell(j).toString());
                }
            }
            returnList.add(i, rowList);
        }
        return returnList;
    }

    /**
     *
     * @param scenerio
     * @param time
     * @param browser
     */
    public static void exceleYaz(Scenario scenerio, String time, String browser) {
        String path = "src/main/resources/NewFile.xlsx";
        String sheetName= "Sonuclar";
        File f = new File(path); //  f.exists()  // dosya var sa

        if (!f.exists()) {  // dosya yok ise oluştur
            XSSFWorkbook workbook = new XSSFWorkbook(); // hazfızada workbook oluştur.
            XSSFSheet sheet = workbook.createSheet(sheetName);  // hazıfazda sheet oluştur.

            Row row = null;
            Cell cell = null;
            row = sheet.createRow(0);   // satır oluştur
            cell = row.createCell(0);   // hucreler oluştur
            cell.setCellValue(scenerio.getName());
            cell = row.createCell(1);
            cell.setCellValue(scenerio.getStatus());
            cell = row.createCell(2);
            cell.setCellValue(time);
            cell = row.createCell(3);
            cell.setCellValue(browser);
            try {
                // dosyayı oluşturduk.
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                workbook.write(fileOutputStream);  // içine hafızadaki bilgileri yazdık.
                workbook.close();                  // hafızayı boşalttık
                fileOutputStream.close();           // dosyayı kapattık.
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            FileInputStream fileInputStream;
            Workbook workbook = null;
            Sheet sheet = null;
            try {
                fileInputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(fileInputStream);
                sheet = workbook.getSheet(sheetName);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Row row = null;
            Cell cell = null;
            int numberOfRows = sheet.getPhysicalNumberOfRows();
            row = sheet.createRow(numberOfRows);
            cell = row.createCell(0);
            cell.setCellValue(scenerio.getName());
            cell = row.createCell(1);
            cell.setCellValue(scenerio.getStatus());
            cell = row.createCell(2);
            cell.setCellValue(time);
            cell = row.createCell(3);
            cell.setCellValue(browser);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                workbook.write(fileOutputStream);
                workbook.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        List<List<String>> gelenList = getListData("src/main/resources/ApacheExcelUtility.xlsx", "Sayfa1", 4);
        System.out.println(gelenList);

    }
}
