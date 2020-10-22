/**
 * @Author:Otosun Tarih :21/10/2020
 */
package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path="src/main/resources/ApacheExcel1.xlsx";
        FileInputStream dosyaOkumaYolu=new FileInputStream(path);
        Workbook calismaKitabi=WorkbookFactory.create(dosyaOkumaYolu);
        Sheet calismaSayfasi=calismaKitabi.getSheet("Sheet1");
//        Sheet calismaSayfasi=calismaKitabi.getSheetAt(0);
        Row satir=calismaSayfasi.getRow(0);
        Cell hucre=satir.getCell(0);
        System.out.println(hucre);


    }


}
