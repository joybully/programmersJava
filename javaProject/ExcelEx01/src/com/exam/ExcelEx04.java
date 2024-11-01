package com.exam;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ExcelEx04 {
    public static void main(String[] args) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File("./excel.xls"));
            // sheet 데이터
            Sheet sheet = workbook.getSheet(0);

            for(int i=3;i<sheet.getRows(); i++){
                for(int j =13; j< sheet.getColumns(); j++){
                    // 열먼저 넣고 행을 나중에 넣는다
                    System.out.print(sheet.getCell(j,i).getContents() + "\t");
                }
                System.out.println();
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
