package com.exam;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ExcelEx02 {
    public static void main(String[] args) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File("./jxlrwtest.xls"));
            // sheet 데이터
            Sheet sheet = workbook.getSheet(0);
            System.out.println(sheet.getName());
            System.out.println(sheet.getRows());
            System.out.println(sheet.getColumns());

            // Cell 데이터
            // Cell cell = sheet.getCell(0,0);
            // System.out.println(cell.getContents());

            for(int i=0;i<11;i++){
                Cell cell = sheet.getCell(i,2);
                System.out.println(cell.getContents());
            }
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (BiffException e) {
            System.out.println("[에러] : "+ e.getMessage());
        } finally{
            if(workbook != null){workbook.close();}
        }
    }
}
