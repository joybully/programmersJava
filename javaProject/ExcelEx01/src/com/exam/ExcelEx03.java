package com.exam;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ExcelEx03 {
    public static void main(String[] args) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File("./excel.xls"));
            // sheet 데이터
            Sheet sheet = workbook.getSheet(0);

            System.out.println(sheet.getName());
            System.out.println(sheet.getColumns());
            System.out.println(sheet.getRows());

            Cell cell1 = sheet.getCell(0,0);
            System.out.println(cell1.getContents());


        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (BiffException e) {
            System.out.println("[에러] : "+ e.getMessage());
        } finally{
            if(workbook != null){workbook.close();}
        }
    }
}
