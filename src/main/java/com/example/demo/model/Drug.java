package com.example.demo.model;

/**
 * @author XYH
 * @date 2019/9/12 13:48
 */
public class Drug {
    private String DrugName;
    private String DrugNameCHN;
    private String DrugDescCHN;
    private String AdaptationDisease;
    private String Domestic;
    private String Company;

    public String getDrugName() {
        return DrugName;
    }

    public void setDrugName(String drugName) {
        DrugName = drugName;
    }

    public String getDrugNameCHN() {
        return DrugNameCHN;
    }

    public void setDrugNameCHN(String drugNameCHN) {
        DrugNameCHN = drugNameCHN;
    }

    public String getDrugDescCHN() {
        return DrugDescCHN;
    }

    public void setDrugDescCHN(String drugDescCHN) {
        DrugDescCHN = drugDescCHN;
    }

    public String getAdaptationDisease() {
        return AdaptationDisease;
    }

    public void setAdaptationDisease(String adaptationDisease) {
        AdaptationDisease = adaptationDisease;
    }

    public String getDomestic() {
        return Domestic;
    }

    public void setDomestic(String domestic) {
        Domestic = domestic;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }
}
