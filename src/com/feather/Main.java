package com.feather;

import com.feather.business.report.IReport;
import com.feather.business.report.ReportBuilder;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        ReportBuilder rB= new ReportBuilder();
        IReport report=rB.builder(args[0]);
        report.generate(123);


    }
}
