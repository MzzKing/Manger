package com.yyq.storeback.controller;

import com.github.pagehelper.PageInfo;
import com.yyq.storeback.pojo.Product;
import com.yyq.storeback.pojo.Supplier;
import com.yyq.storeback.service.serviceImpl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SupplierController {
    @Autowired
    SupplierServiceImpl supplierService;

    @CrossOrigin
    @ResponseBody
    @GetMapping("/suppliers")
    public List<Supplier> getSuppliers(){
        return supplierService.getSuppliers();
    }
}
