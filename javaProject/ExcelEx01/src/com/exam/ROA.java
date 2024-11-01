package com.exam;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ROA {
    public static void main(String[] args) {
        Workbook workbook = null;
        try {
            int[] nums = new int[46];
            for(int i = 0;i<nums.length;i++){
                nums[i] = 0;
            }
            workbook = Workbook.getWorkbook(new File("excel.xls"));
            Sheet sheet = workbook.getSheet(0);
            for(int i =3; i<sheet.getRows(); i++){
                for(int j = 13; j<sheet.getColumns(); j++){
                    ++nums[Integer.parseInt(sheet.getCell(j,i).getContents())];
                }
            }
            int max = nums[0];
            for(int data:nums){
                if(max<data) max = data;
            }
            System.out.println("번호"+"\t" +"당첨횟수"+"\t"+"그래프");
            for(int i=1;i<nums.length;i++){
                int percentage = (int)Math.round(((double)nums[i]/max)*100);
                int repeat = (percentage/5);
                if(repeat==20) System.out.print(i+"\t"+nums[i]+"\t"+"\t"+percentage+"%"+"\t"+"*".repeat(repeat)+"\n");
                else System.out.print(i+"\t"+nums[i]+"\t"+"\t"+percentage+"%"+"\t"+"\t"+"*".repeat(repeat)+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (BiffException e) {
            throw new RuntimeException(e);
        } finally {
            if (workbook != null) workbook.close();
        }
    }
}
