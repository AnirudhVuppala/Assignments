package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelUtil {


    public static void updateCellByFirstNameAndEmail(
            String excelFilePath,
            String sheetName,
            String firstName,
            String email,
            String targetColumnName,
            String newValue
    ) throws IOException {

        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        Row headerRow = sheet.getRow(0);
        int firstNameCol = -1;
        int emailCol = -1;
        int targetCol = -1;

        for (Cell cell : headerRow) {
            String colName = cell.getStringCellValue().trim();
            if (colName.equalsIgnoreCase("first name")) {
                firstNameCol = cell.getColumnIndex();
            } else if (colName.equalsIgnoreCase("email")) {
                emailCol = cell.getColumnIndex();
            } else if (colName.equalsIgnoreCase(targetColumnName)) {
                targetCol = cell.getColumnIndex();
            }
        }

        if (firstNameCol == -1 || emailCol == -1 || targetCol == -1) {
            workbook.close();
            fis.close();
            throw new IllegalArgumentException("Column names not found in the sheet.");
        }

        boolean updated = false;

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row != null) {
                Cell firstNameCell = row.getCell(firstNameCol);
                Cell emailCell = row.getCell(emailCol);

                if (firstNameCell != null && emailCell != null &&
                        firstNameCell.getStringCellValue().equalsIgnoreCase(firstName) &&
                        emailCell.getStringCellValue().equalsIgnoreCase(email)) {

                    Cell targetCell = row.getCell(targetCol);
                    if (targetCell == null) {
                        targetCell = row.createCell(targetCol);
                    }
                    targetCell.setCellValue(newValue);
                    System.out.println("Updated row " + i + ": " + targetColumnName + " -> " + newValue);
                    updated = true;
                    break;
                }
            }
        }

        fis.close();

        if (updated) {
            FileOutputStream fos = new FileOutputStream(excelFilePath);
            workbook.write(fos);
            fos.close();
        }

        workbook.close();
    }

    public static void main(String[] args) throws IOException {
        String filePath = "data/test.xlsx";
        String sheet = "Sheet1";

        updateCellByFirstNameAndEmail(filePath, sheet, "Alice", "alice@example.com", "age", "31");
    }
}

