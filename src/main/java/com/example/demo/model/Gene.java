package com.example.demo.model;

public class Gene {
    private String GeneName;
    private Integer GeneID;
    private String TumorSuppressor;
    private String Oncogene;
    private String GeneDescCHN;
    private String HighLevelSen;
    private String HighLevelRes;

    public String getGeneName() {
        return GeneName;
    }
    public void setGeneName(String geneName) {
        GeneName = geneName;
    }

    public Integer getGeneID() {
        return GeneID;
    }

    public void setGeneID(Integer geneID) {
        GeneID = geneID;
    }

    public String getOncogene() {
        return Oncogene;
    }

    public String getTumorSuppressor() {
        return TumorSuppressor;
    }

    public void setOncogene(String oncogene) {
        Oncogene = oncogene;
    }

    public void setTumorSuppressor(String tumorSuppressor) {
        TumorSuppressor = tumorSuppressor;
    }

    public String getGeneDescCHN() {
        return GeneDescCHN;
    }

    public String getHighLevelRes() {
        return HighLevelRes;
    }

    public String getHighLevelSen() {
        return HighLevelSen;
    }

    public void setGeneDescCHN(String geneDescCHN) {
        GeneDescCHN = geneDescCHN;
    }

    public void setHighLevelRes(String highLevelRes) {
        HighLevelRes = highLevelRes;
    }

    public void setHighLevelSen(String highLevelSen) {
        HighLevelSen = highLevelSen;
    }
}
