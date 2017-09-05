package com.apache.poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	private static final String FILENAME = "C:/Users/jasleen/Desktop/excelWrite.xlsx";

	public static void main(String[] args) {
		try {
			FileInputStream excelFile = new FileInputStream(FILENAME);
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet dataTypeSheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = dataTypeSheet.iterator();

			while (rowIterator.hasNext()) {
				Row currentRow = rowIterator.next();
				Iterator<Cell> cellIterator = currentRow.iterator();
				while (cellIterator.hasNext()) {
					Cell currentCell = cellIterator.next();
					System.out.println("UPDATE [pbg].[dbo].[FUNCTION_ROOM_NUMBER_INFO] SET ");
					if (currentCell.getCellTypeEnum() == CellType.STRING) {
						System.out.println(currentCell.getStringCellValue() + " = value WHERE condition  -- ");
					} else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
						System.out.println(currentCell.getNumericCellValue() + " = value WHERE condition  -- ");
					}
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
