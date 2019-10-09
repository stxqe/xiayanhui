package com.example.demo.controlller;

import com.example.demo.dao.DrugDao;
import com.example.demo.model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 药物信息
 * @author XYH
 * @date 2019/9/12 13:42
 */
@RestController
@RequestMapping("/drug")
public class DrugController {

    @Autowired
    private DrugDao drugDao;

    @GetMapping("/selectDrug")
    public List<Drug> getGeneID() {
        return drugDao.getDrugID();
    }

}
