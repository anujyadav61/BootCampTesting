package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataReader {

    private Workbook workbook;
    private Sheet sheet;
    private DataFormatter formatter = new DataFormatter();

    public ExcelDataReader(String filePath) {

        try {

            FileInputStream fis = new FileInputStream(new File(filePath));

            workbook = WorkbookFactory.create(fis);

            sheet = workbook.getSheetAt(0);

            fis.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    private String getCellData(int rowNum, int colNum) {

        Row row = sheet.getRow(rowNum);

        if (row == null) {

            return "";

        }

        Cell cell = row.getCell(colNum);

        if (cell == null) {

            return "";

        }

        return formatter.formatCellValue(cell);

    }

    // Login Data

    public String getUsername(int rowNum) {

        return getCellData(rowNum, 0);

    }

    public String getPassword(int rowNum) {

        return getCellData(rowNum, 1);

    }

    // Age Calculator Data

    public String getDay(int rowNum) {

        return getCellData(rowNum, 0);

    }

    public String getMonth(int rowNum) {

        return getCellData(rowNum, 1);

    }

    public String getYear(int rowNum) {

        return getCellData(rowNum, 2);

    }

    public void closeWorkbook() {

        try {

            if (workbook != null) {

                workbook.close();

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}