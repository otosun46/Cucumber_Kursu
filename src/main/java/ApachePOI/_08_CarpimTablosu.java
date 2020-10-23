/**
 * @Author:Otosun Tarih :22/10/2020
 */
package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_CarpimTablosu {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/CarpimTablosu.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Benim Sayfam");

//        Row row = sheet.createRow(0);
//        Cell cell = row.createCell(0);
//        cell.setCellValue("Merhaba Dunya");
        Row row =null;
        Cell cell =null;
        int rowCount=0;
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                row = sheet.createRow(rowCount++);
                cell = row.createCell(0);
                cell.setCellValue(i+"");
                cell = row.createCell(1);
                cell.setCellValue(" X ");
                cell = row.createCell(2);
                cell.setCellValue(j+"");
                cell = row.createCell(3);
                cell.setCellValue(" = ");
                cell = row.createCell(4);
                cell.setCellValue(""+i * j);
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();

    }
}
