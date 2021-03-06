package com.feather.business.report;

public class PDFReport implements IReport{
    @Override
    public void generate(int ID) {
        System.out.println("Reporte PDF" + ID);
    }
}
