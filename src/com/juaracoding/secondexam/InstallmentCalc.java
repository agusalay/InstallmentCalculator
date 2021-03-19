package com.juaracoding.secondexam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class InstallmentCalc {

	//reference formula : https://www.programmersought.com/article/2507252959/
	
	public static double calculatePMT(double rate, double nper, double pv) {
        double v = (1 + (rate / 12));
        double t = (-(nper / 12) * 12);
        double result = (pv * (rate / 12)) / (1 - Math.pow(v, t));
        return result;
    }
	
	
	public static double calculateInterest(double rate, double pv) {
		
		return (rate / 360) * 30 * pv;
	}
	
	public static ArrayList<InstallmentTable> calculateInstallmentTable(double rate, double nper, double pv, LocalDate startDt) 
	{
		
		double installment = calculatePMT(rate, nper, pv);
		
		ArrayList<InstallmentTable> instaList =new ArrayList<InstallmentTable>();  
		
		double OSPrincipal = pv;		
		
		for (int i = 0; i < nper; i++)
		{
			LocalDate nextDueDt = startDt.plusMonths(i);
			
			double interest = calculateInterest(rate, OSPrincipal);
			
			double principalAmt = installment - interest;
			
			OSPrincipal -= principalAmt;
			
			InstallmentTable instData = new InstallmentTable(i+1, nextDueDt, installment, principalAmt, interest, OSPrincipal);
			
			instaList.add(instData);
			
					
		}
		
		return instaList;
	}
	
}
	
