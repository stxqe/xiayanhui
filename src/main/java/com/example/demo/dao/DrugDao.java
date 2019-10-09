package com.example.demo.dao;

import com.example.demo.model.Drug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DrugDao {

    @Select("select distinct DrugName,DrugNameCHN from Drugs")
    List<Drug> getDrugID();

}
