package com.nhce;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelFile {

	public void readExcel() throws BiffException,IOException
	 {
	String Filepath="E:\\Adil1.xls";
	FileInputStream fs=new FileInputStream(Filepath);
	Workbook wb = Workbook.getWorkbook(fs);
	Sheet sh=wb.getSheet("Sheet1");
	int total_no_of_rows=sh.getRows();
	int total_no_of_columns=sh.getColumns();
	for(int row=0;row<total_no_of_rows;row++)
	{
	for(int col=0;col<total_no_of_columns;col++)
	{
	 System.out.print(sh.getCell(col,row).getContents() +"\t");
	}
	System.out.println();
	}
	 }
	public static void main(String args[]) throws BiffException,IOException
	{
	ReadExcelFile DT=new ReadExcelFile();
	DT.readExcel();
	}
}
