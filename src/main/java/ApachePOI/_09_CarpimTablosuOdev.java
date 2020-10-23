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

public class _09_CarpimTablosuOdev {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/CarpimTablosu.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Carpim Tablosu");

        Row row =null;
        Cell cell =null;
        int add=0;

        for (int i = 1; i <= 10; i++) {
            row = sheet.createRow(i-1);
            for (int j = 1; j <= 10; j++) {
                add=(j-1)*6;
                cell = row.createCell(0+add); cell.setCellValue(i);
                cell = row.createCell(1+add); cell.setCellValue(" X ");
                cell = row.createCell(2+add); cell.setCellValue(j);
                cell = row.createCell(3+add); cell.setCellValue(" = ");
                cell = row.createCell(4+add); cell.setCellValue(i * j);
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileOutputStream.close();
    }
}
