package com.example.demo.controlller;

import com.example.demo.dao.TargetsDao;
import com.example.demo.model.Drug;
import com.example.demo.model.GeneVariations;
import com.example.demo.model.Targets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 靶向信息
 * @author XYH
 * @date 2019/9/06
 */
@RestController
@RequestMapping("/tar")
public class TargetsController {

    private static final Logger log = LoggerFactory.getLogger("adminLogger");

    @Autowired
    private TargetsDao targetsDao;

    /**
     * 所有靶向信息表格
     */
    @GetMapping("/tarList")
    public Map<String, Object> listTar(String selectGene, String selectType, String selectDrug, String selectLevel, String field, String order) {
        log.info("需要排序的字段："+field+ "    顺序："+order);
        List<Targets> list;
        Map<String, Object> listAll = new HashMap<String, Object>();
        listAll.put("code", 0);
        listAll.put("msg", "");
/*        if (selectGene != null || selectType != null || selectDrug != null|| selectLevel != null) {*/
/*        if(field!=""&&field!=null) {*/
            log.info("需要排序");
            list = targetsDao.getTargetsSelectOrder(selectGene, selectType, selectDrug, selectLevel, field, order);
            listAll.put("count", targetsDao.getCount());
            listAll.put("data", list);
/*        }*/
        /*else {
            log.info("不需要排序");
            list = targetsDao.getTargetsSelect(selectGene, selectType, selectDrug, selectLevel);
            listAll.put("count", targetsDao.getCount());
            listAll.put("data", list);
        }*/

/*        } else {
            list = targetsDao.getTargetsAll(field ,order);
            listAll.put("count", targetsDao.getCount());
            listAll.put("data", list);
        }*/
        return listAll;
    }

    /**
     * 搜索靶向信息
     */
    @GetMapping("/select")
    public List<Targets> getGeneID(String selectGene, String selectType, String selectDrug, String selectLevel) {
        if (selectGene != null || selectType != null || selectDrug != null || selectLevel != null) {
            return targetsDao.getGeneSelect(selectGene, selectType, selectDrug, selectLevel);
        }
        else {
            return targetsDao.getGene();
        }
    }

    /**
     * 有药物信息则显示
     */
    @GetMapping("/drug/{drugName}")
    public Drug getDrugMsg(@PathVariable String drugName) {
        Drug msg =targetsDao.getDrugMsg(drugName);
        return msg;
    }

    /**
     * 与该基因有关的临床信息表格
     */
    @GetMapping("/aboutGene")
    public Map<String, Object> aboutGnen(String geneName, String alteration,String field, String order){
        log.info(geneName+"  "+alteration);
        log.info("需要排序的字段："+field+ "    顺序："+order);
        boolean isNum = geneName.matches("[0-9]+");
        List<Targets> list;
        Map<String, Object> listAll = new HashMap<String, Object>();
        listAll.put("code",0);
        listAll.put("msg", "");
        if(isNum)
            list = targetsDao.getAboutGeneID(geneName,alteration,field, order);
        else
            list = targetsDao.getAboutGene(geneName,alteration, field, order);
        listAll.put("count", targetsDao.getCount());
        listAll.put("data", list);
        return listAll;
    }

    /**
     * 与该基因有关的已注释突变表格
     */
    @GetMapping("/aboutVar")
    public Map<String, Object> aboutVal(String geneName, String alteration,String field, String order){
        log.info(geneName+"  "+alteration);
        boolean isNum = geneName.matches("[0-9]+");
        List<GeneVariations> list;
        Map<String, Object> listAll = new HashMap<String, Object>();
        listAll.put("code",0);
        listAll.put("msg", "");
        if(isNum)
            list = targetsDao.getAboutVarID(geneName,alteration,field, order);
        else
            list = targetsDao.getAboutVar(geneName,alteration,field, order);
        listAll.put("count", targetsDao.getCount());
        listAll.put("data", list);
        return listAll;
    }
}
