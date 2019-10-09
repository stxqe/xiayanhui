package com.example.demo.dao;

import com.example.demo.model.Gene;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface GeneDao {

/*    @Select("select * from genes g limit #{pages},#{limit}")*/
    List<Gene> getGeneAllPage(@Param("geneName") String geneName,@Param("pages") Integer pages,@Param("limit") Integer limit,@Param("field") String field , @Param("order") String order);

    List<Gene> getGeneAll(@Param("geneName") String geneName);

/*    @Select("select g.GeneName,g.GeneID from genes g limit #{pages},#{limit}")
    List<Gene> getGeneAll();*/

    @Select("select distinct g.GeneName,g.GeneID from Genes g")
    List<Gene> getGeneID();

    @Select("select count(*) from Genes")
    Long getCount();

    @Select("select GeneName,GeneID,Oncogene,HighLevelSen,HighLevelRes,g.GeneDescCHN from Genes g where g.GeneName = #{geneName}")
    Gene getGeneMsg(String geneName);

    @Select("select GeneName,GeneID,Oncogene,HighLevelSen,HighLevelRes,g.GeneDescCHN from Genes g where g.GeneID = #{geneName}")
    Gene getGeneIDMsg(String geneName);

}
