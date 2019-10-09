package com.example.demo.dao;

import com.example.demo.model.Drug;
import com.example.demo.model.GeneVariations;
import com.example.demo.model.Targets;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface TargetsDao {

    @Select("SELECT Level, GeneName, Alteration, CanTypeCHN, Drug, EvidenceCHN FROM Target ORDER BY Level, GeneName, Alteration")
    List<Targets> getTargetsAll(String field ,String order);

    @Select("select count(*) from Target")
    Long getCount();

    List<Targets> getTargetsSelectOrder(@Param("selectGene") String selectGene, @Param("selectType") String selectType, @Param("selectDrug") String selectDrug, @Param("selectLevel") String selectLevel, @Param("field") String field , @Param("order") String order);

    List<Targets> getTargetsSelect(@Param("selectGene") String selectGene, @Param("selectType") String selectType, @Param("selectDrug") String selectDrug, @Param("selectLevel") String selectLevel);

    @Select("select t.GeneName,t.CanTypeCHN,t.Drug from Target t")
    List<Targets> getGene();

    List<Targets> getGeneSelect(@Param("selectGene") String selectGene, @Param("selectType") String selectType, @Param("selectDrug") String selectDrug, @Param("selectLevel") String selectLevel);

    @Select("select DrugName,DrugNameCHN,d.DrugDescCHN,AdaptationDisease,Domestic,Company from Drugs d where d.DrugName = #{drugName}")
    Drug getDrugMsg(String drugName);

/*    @Select("SELECT Alteration, CanTypeCHN, Drug, DrugCHN, Level, EvidenceCHN, PMIDs FROM Target WHERE GeneName = #{geneName} ORDER BY Level")*/
    List<Targets> getAboutGene(@Param("geneName") String geneName, @Param("alteration") String alteration, @Param("field") String field , @Param("order") String order);

    List<Targets> getAboutGeneID(@Param("geneName") String geneName, @Param("alteration") String alteration, @Param("field") String field , @Param("order") String order);

/*    @Select("SELECT Alteration, OncogenicityCHN, MutEffectCHN, VarSummaryCHN, PMIDs FROM GeneVariations WHERE GeneName  = #{geneName}")*/
    List<GeneVariations> getAboutVar(@Param("geneName") String geneName,@Param("alteration") String alteration, @Param("field") String field , @Param("order") String order);

    List<GeneVariations> getAboutVarID(@Param("geneName") String geneName,@Param("alteration") String alteration, @Param("field") String field , @Param("order") String order);

}
