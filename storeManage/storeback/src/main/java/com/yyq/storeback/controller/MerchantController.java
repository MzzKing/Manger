package com.yyq.storeback.controller;



import com.github.pagehelper.PageInfo;
import com.yyq.storeback.pojo.Merchant;
import com.yyq.storeback.service.serviceImpl.MerchantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class MerchantController {

    @Autowired
    MerchantServiceImpl merchantService;


    @CrossOrigin
    @ResponseBody
    @GetMapping("/getMerchants/{pg}")
    public PageInfo<Merchant> getMerchants(@PathVariable("pg") Integer pg){
        return merchantService.getMerchantPage(pg);
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/industry/{pg}")
    public PageInfo<Merchant> getMerchantsByIndustry(@PathVariable("pg") Integer pg,@RequestBody Map<String, Object> map){
        String industry = (String) map.get("industry");
        return merchantService.getindustryPage(pg,industry);
    }

    @CrossOrigin
    @GetMapping("/search/{pg}")
    @ResponseBody
    public PageInfo<Merchant> search(@PathVariable("pg") Integer pg,@RequestParam("name") String name) {
        return merchantService.getsearchPage(pg,name);
    }


    @CrossOrigin
    @ResponseBody
    @DeleteMapping("/deleteMerchant/{id}")
    public String delete(@PathVariable("id") Integer id) {
        merchantService.deleteMercantById(id);
        return "success";
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/addMerchant")
    public String addMerchant(@RequestBody Merchant merchant) {
        merchantService.addMerchant(merchant);
        return "success";
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping("/getMerchantById/{merchantId}")
    public Merchant getMerchantById(@PathVariable("merchantId") Integer merchantId) {
        return merchantService.getMerchantById(merchantId);
    }

    @ResponseBody
    @CrossOrigin
    @PutMapping ("/updateMerchant/{merchantId}")
    public String updateMerchant(@PathVariable("merchantId") Integer merchantId,@RequestBody Merchant merchant){
        merchant.setMerchantId(merchantId);
        merchantService.updateMerchant(merchant);
        return "success";
    }


}
