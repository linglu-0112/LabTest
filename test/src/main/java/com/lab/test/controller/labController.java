package com.lab.test.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lab.test.service.labDataService;

@Controller
@ResponseBody
@Component

public class labController {

    @Autowired 
    private labDataService lds;
    
    @RequestMapping("/lab_hello")
    public String hello(){
        return "Hello World";
    }

    @RequestMapping("/insertPlatformData/{select_TabName}/{tableName}")
    public String insertPlatformData(@PathVariable String select_TabName,@PathVariable String tableName){
        try{
            lds.insertPlatformData(select_TabName, tableName);
        }catch(Exception e){
            e.printStackTrace();
            return "error"; 
        }
        return "实验平台温湿度数据插入成功！";
    }
}
