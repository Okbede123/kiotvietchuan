package org.example.Testcase;

import org.apache.poi.ss.usermodel.*;
import org.checkerframework.checker.units.qual.C;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        int countRow = 1;
        String result = "";
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\Downloads\\testbangtinh.xlsx");
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("Trang tính1");
        //hàng ngang
        Row row;
        Row row1;
        // hàng cột
        //Cell cell = row.getCell(0);

        while (!result.contains("null") ){
            row = sheet.getRow(countRow);
            row1 = sheet.getRow(countRow);
            countRow++;
            result = String.valueOf(row.getCell(0)) + "|" + String.valueOf(row1.getCell(1));
            if(!result.contains("null")){
                list.add(result);
                //System.out.println(result);
            }
        }
        getResult(list);


//        cell.setCellValue("test23");
//        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\Downloads\\testbangtinh2.xlsx");
//        workbook.write(fileOutputStream);
    }

    public static void getResult(ArrayList<String> arrayList){
        for (String list:arrayList) {
            String[] test = list.split("[|]");
            getResult1(test[0] , test[1]);
        }
    }

    public static void getResult1(String value1,String value2){
        System.out.println(value1 + value2);
    }


//        do{
//            cell = row.getCell(countCell);
//            System.out.println(cell.getStringCellValue());
//            countCell++;
//            count++;
//        }while (count < 4);

//        do{
//            //vòng lặp này để duyệt giá trị tung phần tử của cột
//            row = sheet.getRow(countRow);
//            row1 = sheet.getRow(countRow);
//            //ví dụ là cột 0
//            System.out.println(row.getCell(0) + "|" + row1.getCell(1));
//            //lấy ra hết giá trị của cột 0
////            String test = String.valueOf(row.getCell(0));
//            countRow++;
//            count++;
//            // doan count < 6 chua hanled đc
//        }while (!String.valueOf(row.getCell(0)).equals("null") && !String.valueOf(row.getCell(1)).equals("null") );


    //vòng lặp này để duyệt giá trị tung phần tử của cột
}
