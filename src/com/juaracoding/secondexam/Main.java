package com.juaracoding.secondexam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isExit = true;
		
		while (isExit) {
			
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Installment Calculator");
		System.out.println("Please input Start Date (YYYY-MM-dd)");
		
		LocalDate  startDt = LocalDate.parse(scan.next());
		
		System.out.println("Please input Loan Amount");
		
		double loanAmt = scan.nextDouble();
		
		System.out.println("Please input Rate");
		
		double rate = scan.nextDouble();
	
		System.out.println("Please input Tenor");
		
		double tenor = scan.nextDouble();
		
		ArrayList<InstallmentTable> instaList =new ArrayList<InstallmentTable>();  
		
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d-MM-uuuu");
		
		System.out.format("%10s %10s %10s %10s %10s  %10s %n", "angsuranke", "tanggal","totalangsuran", "angusuranpokok", "angsuranbunga", "sisapinjaman");
		
		instaList = InstallmentCalc.calculateInstallmentTable(rate, tenor, loanAmt, startDt);
		
		for (int i = 0; i < instaList.size(); i++)
		{
			InstallmentTable a = instaList.get(i);
			
			a.getSeqNo();
			
			System.out.format("%10d %10s %10f %10f %10f  %10f %n", a.getSeqNo(), a.getDueDate().format(formatters), a.getInstallmentAmt(), a.getPrincipalAmt(), a.getInterest(), a.getOSPrincipalAmt());

		}
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Inputan Salah");
		}
	 }	
	}
}
