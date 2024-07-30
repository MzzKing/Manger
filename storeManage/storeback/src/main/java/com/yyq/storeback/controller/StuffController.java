package com.yyq.storeback.controller;

import com.github.pagehelper.PageInfo;
import com.yyq.storeback.pojo.SearchStuff;
import com.yyq.storeback.pojo.Stuff;
import com.yyq.storeback.service.serviceImpl.StuffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StuffController {
    @Autowired
    StuffServiceImpl stuffService;

    @CrossOrigin
    @ResponseBody
    @GetMapping("/stuff/{pg}")
    public PageInfo<Stuff> getStuffs(@PathVariable("pg") Integer pg){
        return stuffService.getStuffPage(pg);
    }

    @CrossOrigin
    @ResponseBody
    @DeleteMapping("/delstuff/{id}")
    public String delStuff(@PathVariable("id") Integer id){
        stuffService.delStuff(id);
        return "success";
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/searchStuff/{pg}")
    public PageInfo<Stuff> search(
            @PathVariable("pg") Integer pg,
            @RequestBody SearchStuff searchStuff) {
        if (searchStuff.getEmployeeName().equals("")){
            searchStuff.setEmployeeName(null);
        }
        if (searchStuff.getCountry().equals("")){
            searchStuff.setCountry(null);
        }
        if (searchStuff.getAddress().equals("")){
            searchStuff.setAddress(null);
        }
        // 根据搜索条件查询数据库
        PageInfo<Stuff> stuff = stuffService.searchStuff(pg,searchStuff);
        return stuff;
    }
}
