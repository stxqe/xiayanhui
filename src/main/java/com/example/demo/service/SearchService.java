package com.example.demo.service;

import org.springframework.stereotype.Service;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 查询/输出（java调用python）
 * @author XYH
 * @date 2019/9/07
 */

@Service
public class SearchService {
    public Map<String,Object> getSearResult(String geneName){
        Map<String,Object> rows = new HashMap<String, Object>();
        Process proc;
        System.out.println("传入python的参数"+geneName);
        try {
            String[] args = new String[] {"python","F:\\query_gene.py",geneName};
            //proc = Runtime.getRuntime().exec("python F:\\query_gene_out.py");// 执行py文件
            //用输入输出流来截取结果
            proc = Runtime.getRuntime().exec(args);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            line = in.readLine();
            /*while ((line = in.readLine()) != null) {*/
                System.out.println("传入python的结果"+line);
                System.out.println("源结果"+in.readLine());
            /*}*/
            in.close();
            proc.waitFor();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rows;
    }

}
