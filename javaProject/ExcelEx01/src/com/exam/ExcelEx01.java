package com.exam;

import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ExcelEx01 {
    public static void main(String[] args) {
        Workbook workbook = null;

        try {
            workbook = Workbook.getWorkbook(new File("./jxlrwtest.xls"));
            System.out.println(workbook.getVersion());
            System.out.println(workbook.getNumberOfSheets());
            String[] names = workbook.getSheetNames();
            System.out.println(Arrays.toString(names));
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } catch (BiffException e) {
            System.out.println("[에러] : "+ e.getMessage());
        } finally{
            if(workbook != null){workbook.close();}
        }
    }
}
