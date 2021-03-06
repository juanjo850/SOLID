package com.feather.business.report;


public class ReportBuilder {
    public IReport builder (String s) throws Exception{
            Class c=Class.forName("com.feather.business.report." + s + "Report");
        return (IReport) c.getDeclaredConstructor().newInstance();
    }
}
