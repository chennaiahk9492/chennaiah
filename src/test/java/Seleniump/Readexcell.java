package Seleniump;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Readexcell {
    public static void main(String[] args) throws IOException {
        indicels(8,2);
        allvalues(2,2);
       // createvalues(2,2);


    }
        public static void indicels(int rowN, int celN) throws IOException {
        FileInputStream fis=new FileInputStream("C:\\Users\\hp\\IdeaProjects\\chennaiah\\TestData\\chennai1.xlsx");
        Workbook wb=WorkbookFactory.create(fis);
        Sheet s= wb.getSheet("Sheet1");
        Row r=s.getRow(rowN);
        Cell c=r.getCell(celN);
        String data=c.getStringCellValue();
        System.out.println(data);
    }
    public static void allvalues(int cellN, int cellM) throws IOException {
        FileInputStream fos=new FileInputStream("C:\\Users\\hp\\IdeaProjects\\chennaiah\\TestData\\chennai1.xlsx");
        Workbook wb=WorkbookFactory.create(fos);
        Sheet s= wb.getSheet("Sheet1");
        int lastrownumber=s.getLastRowNum();
        for (int i=0; i<lastrownumber; i++){
            Row r=s.getRow(i);
            Cell c=r.getCell(cellN);
            Cell c1=r.getCell(cellM);
            String data=c.getStringCellValue();//by usng this only we get names
            String data1=c1.getStringCellValue();
            System.out.println(data+" "+data1);

        }
    }
    public static void createvalues(int rowN,int cellN) throws IOException{
        FileInputStream css=new FileInputStream("C:\\Users\\hp\\IdeaProjects\\chennaiah\\TestData\\chennai1.xlsx");
        Workbook wb=WorkbookFactory.create(css);
        Sheet s=wb.createSheet("chennai");
        Row r=s.createRow(rowN);
        Cell c=r.createCell(cellN);
        c.setCellValue("chaari");
        FileOutputStream csss=new FileOutputStream("C:\\Users\\hp\\IdeaProjects\\chennaiah\\TestData\\chennai1.xlsx");
        wb.write(csss);
        csss.close();
//Note; close the consorn excel sheet& delete the all other methods which is working on same excel in this class
// when we r creating the sheet and cell values

    }


}
