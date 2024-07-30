package com.yyq.storeback.controller;

import com.github.pagehelper.PageInfo;
import com.yyq.storeback.pojo.Merchant;
import com.yyq.storeback.pojo.Product;
import com.yyq.storeback.pojo.ResData;
import com.yyq.storeback.pojo.SearchParam;
import com.yyq.storeback.service.serviceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.CodeSource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @CrossOrigin
    @ResponseBody
    @GetMapping("/products/{pg}")
    public PageInfo<Product> getProducts(@PathVariable("pg") Integer pg){
        return productService.getProductPage(pg);
    }

    @CrossOrigin
    @ResponseBody
    @DeleteMapping("/delproduct/{id}")
    public String delProduct(@PathVariable("id") Integer id){
        productService.delProduct(id);
        return "success";
    }

    @CrossOrigin
    @PostMapping("/deleteGoods")
    @ResponseBody
    public String deleteGoods(@RequestBody List<Integer> ids) {
        System.out.println(ids);
        // 进行相应的业务逻辑处理，删除商品等操作
        productService.batchDeleteByIds(ids);
        // 返回处理结果
        return "success";
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/searchGoods/{pg}")
    public PageInfo<Product> search(
            @PathVariable("pg") Integer pg,
            @RequestBody SearchParam searchParam) {

        if (searchParam.getItems_title().equals("")){
            searchParam.setItems_title(null);
        }
        if (searchParam.getGood_type().equals("")){
            searchParam.setGood_type(null);
        }
        // 根据搜索条件查询数据库
        PageInfo<Product> products = productService.searchProduct(pg,searchParam);
        return products;
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/offSlef")
    public ResData offSlef(@RequestBody List<Integer> ids){
        productService.offSlef(ids);
        return null;
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/Shelves")
    public ResData shelves(@RequestBody List<Integer> ids){
        productService.shelves(ids);
        return null;
    }

    @CrossOrigin
    @ResponseBody
    @GetMapping("/loadproductByStatus/{pg}")
    public PageInfo<Product> loadproductByStatus(@PathVariable("pg") Integer pg,@RequestParam("status") Integer status){
        return productService.getProductByStatusPage(pg,status);
    }

    @CrossOrigin
    @ResponseBody
    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Map<String, Object> map){
        String ProductName = (String) map.get("items_name");
        Double Price = Double.parseDouble((String)map.get("price")) ;
        String ProductTitle = (String) map.get("items_title");
        Integer UnitsOnOrder = Integer.parseInt((String) map.get("UnitsOnOrder")) ;
        Integer CategoryID = Integer.parseInt((String) map.get("category")) ;
        String ItemType = (String) map.get("good_type");
        Integer SupplierID = Integer.parseInt((String) map.get("supplier")) ;
        Date createTime = new Date();
        Product product = new Product();
        product.setProductName(ProductName);
        product.setProductTitle(ProductTitle);
        product.setPrice(Price);
        product.setUnitsOnOrder(UnitsOnOrder);
        product.setCreateTime(createTime);
        product.setCategoryID(CategoryID);
        product.setItemType(ItemType);
        product.setSupplierID(SupplierID);
        product.setStock(UnitsOnOrder);
        product.setSaleVolume(0);
        productService.addProduct(product);
        return "success";
    }

    @ResponseBody
    @CrossOrigin
    @PutMapping ("/updateProduct/{productId}")
    public String updateProduct(@PathVariable("productId") Integer productId,@RequestBody Map<String, Object> map){
        String ProductName = (String) map.get("items_name");
        Double Price = Double.parseDouble((String)map.get("price")) ;
        String ProductTitle = (String) map.get("items_title");
        Integer UnitsOnOrder = Integer.parseInt((String) map.get("UnitsOnOrder"));
        Integer CategoryID = Integer.parseInt((String) map.get("category"));
        String ItemType = (String) map.get("good_type");
        Integer SupplierID = Integer.parseInt((String) map.get("supplier"));
        Product product = new Product();
        product.setProductID(productId);
        product.setProductName(ProductName);
        product.setProductTitle(ProductTitle);
        product.setPrice(Price);
        product.setUnitsOnOrder(UnitsOnOrder);
        product.setCategoryID(CategoryID);
        product.setItemType(ItemType);
        product.setSupplierID(SupplierID);
        product.setStock(UnitsOnOrder);
        productService.updateProduct(product);
        return "success";
    }
}
