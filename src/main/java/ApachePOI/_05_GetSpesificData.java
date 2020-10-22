/**
 * @Author:Otosun Tarih :21/10/2020
 */
package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _05_GetSpesificData {


    public static void main(String[] args){
        System.out.println(bul(kullanicidanVeriAl("Aradiginiz bilgiyi giriniz")));
    }

    static String bul(String aranan) {
        String path="src/main/resources/sorguDosyasi.xlsx";
        Workbook workbook=null;
        String bulunan="";
        try {
            FileInputStream inputStream=new FileInputStream(path);
            workbook=WorkbookFactory.create(inputStream);
        }catch (IOException ex){
            ex.printStackTrace();
        }
        Sheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();
//        System.out.println("Satir sayisi= "+rowCount);
        for (int i = 0; i < rowCount; i++) {
            //Row row = sheet.getRow(i);
            int cellCount = sheet.getRow(i).getPhysicalNumberOfCells();
//            System.out.println("Satirdali hucre sayisi= "+cellCount);
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranan)) {
                for (int j = 1; j < cellCount; j++) {
                    String cell = sheet.getRow(i).getCell(j)+"";
                        bulunan += cell+" ";

                }
                break;
            }
        }
        return bulunan;
    }

    public static String kullanicidanVeriAl(String ekranYazisi) {
        Scanner oku = new Scanner(System.in);
        System.out.print(ekranYazisi + ": ");
        String str = oku.nextLine();
        return str;
    }
}