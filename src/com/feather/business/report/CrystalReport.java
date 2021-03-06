package com.feather.business.report;

public class CrystalReport implements IReport{
    @Override
    public void generate(int ID) {
        System.out.println("Reporte Crystal" + ID);
    }
}
