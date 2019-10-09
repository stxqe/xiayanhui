package com.example.demo.model;

public class Targets {
    private String Level;
    private String GeneName;
    private String Alteration;
    private String CanTypeCHN;
    private String Drug;
    private String DrugCHN;
    private String EvidenceCHN;
    private String PMIDs;

    public void setGeneName(String geneName) {
        GeneName = geneName;
    }

    public String getGeneName() {
        return GeneName;
    }

    public String getAlteration() {
        return Alteration;
    }

    public String getCanTypeCHN() {
        return CanTypeCHN;
    }

    public String getDrug() {
        return Drug;
    }

    public String getEvidenceCHN() {
        return EvidenceCHN;
    }

    public String getLevel() {
        return Level;
    }

    public void setAlteration(String alteration) {
        Alteration = alteration;
    }

    public void setCanTypeCHN(String canTypeCHN) {
        CanTypeCHN = canTypeCHN;
    }

    public void setDrug(String drug) {
        Drug = drug;
    }

    public void setEvidenceCHN(String evidenceCHN) {
        EvidenceCHN = evidenceCHN;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getDrugCHN() {
        return DrugCHN;
    }

    public String getPMIDs() {
        return PMIDs;
    }

    public void setDrugCHN(String drugCHN) {
        DrugCHN = drugCHN;
    }

    public void setPMIDs(String PMIDs) {
        this.PMIDs = PMIDs;
    }
}
