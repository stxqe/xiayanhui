package com.example.demo.controlller;

import com.example.demo.dao.GeneDao;
import com.example.demo.model.Gene;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基因信息
 * @author XYH
 * @date 2019/9/04
 */
@RestController
@RequestMapping("/gad")
public class GeneController {

    private static final Logger log = LoggerFactory.getLogger("adminLogger");

    @Autowired
    private GeneDao geneDao;

    /*@Autowired
    private SearchService searchService;*/

    /**
     * 所有基因信息表格（分页）
     */
    @GetMapping("/geneListPage")
    public Map<String,Object> listGenesPage(String geneName ,String curr ,String nums,String field, String order){
        log.info("基因列表页面传入接口的基因名称："+geneName);
        log.info("当前页码："+curr);
        log.info("当前选择/条每页："+nums);
        log.info("需要排序的字段："+field+ "    顺序："+order);
        Integer page= Integer.parseInt(curr);
        Integer limit = Integer.parseInt(nums);
        Integer pages = limit * (page-1);
        List<Gene> list = geneDao.getGeneAllPage(geneName,pages,limit,field,order);
        Map<String,Object> listAll = new HashMap<String, Object>();
        listAll.put("code",0);
        listAll.put("msg","");
        listAll.put("count",geneDao.getCount());
        listAll.put("data",list);
        return listAll;
    }

    /**
     * 所有基因信息表格
     */
    @GetMapping("/geneList")
    public Map<String,Object> listGenes(String geneName){
        log.info("传入接口的基因名称："+geneName);
        List<Gene> list = geneDao.getGeneAll(geneName);
        /*for(Gene gene : list){
            Gene gene1 = new Gene();
            if (gene.getTumorSuppressor()=="-")
                gene1.setTumorSuppressor("");
            if(gene.getOncogene()=="-")
                gene1.setOncogene("");
        }*/
        Map<String,Object> listAll = new HashMap<String, Object>();
        listAll.put("code",0);
        listAll.put("msg","");
        listAll.put("count",geneDao.getCount());
        listAll.put("data",list);
        return listAll;
    }

    /**
     * 基因（ID/名称）下拉框回显
     */
    @GetMapping("/selectGene")
    public List<Gene> getGeneID() {
        return geneDao.getGeneID();
    }

    /**
     * 基因具体信息框显示
     */
    @GetMapping("/search/{geneName}")
    public Gene search(@PathVariable String geneName) {
        /*Map<String,Object> rows = new HashMap<String,Object>();
        rows = searchService.getSearResult(geneName);*/ //调用python脚本
        boolean isNum = geneName.matches("[0-9]+");
        log.info("查询的基因："+geneName);
        log.info("是否为基因ID："+isNum);
        if(isNum)
            return geneDao.getGeneIDMsg(geneName);
        else
            return geneDao.getGeneMsg(geneName);
    }

}
