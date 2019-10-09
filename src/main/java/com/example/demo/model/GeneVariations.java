package com.example.demo.model;

public class GeneVariations {
    private String GeneName;
    private String Alteration;
    private String OncogenicityCHN;
    private String MutEffectCHN;
    private String VarSummaryCHN;
    private String PMIDs;

    public String getGeneName() {
        return GeneName;
    }

    public void setGeneName(String geneName) {
        GeneName = geneName;
    }

    public String getAlteration() {
        return Alteration;
    }

    public void setAlteration(String alteration) {
        Alteration = alteration;
    }

    public String getOncogenicityCHN() {
        return OncogenicityCHN;
    }

    public void setOncogenicityCHN(String oncogenicityCHN) {
        OncogenicityCHN = oncogenicityCHN;
    }

    public String getMutEffectCHN() {
        return MutEffectCHN;
    }

    public void setMutEffectCHN(String mutEffectCHN) {
        MutEffectCHN = mutEffectCHN;
    }

    public String getVarSummaryCHN() {
        return VarSummaryCHN;
    }

    public void setVarSummaryCHN(String varSummaryCHN) {
        VarSummaryCHN = varSummaryCHN;
    }

    public String getPMIDs() {
        return PMIDs;
    }

    public void setPMIDs(String PMIDs) {
        this.PMIDs = PMIDs;
    }
}
