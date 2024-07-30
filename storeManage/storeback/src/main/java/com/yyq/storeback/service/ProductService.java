package com.yyq.storeback.service;

import com.github.pagehelper.PageInfo;
import com.yyq.storeback.pojo.Product;
import com.yyq.storeback.pojo.SearchParam;

import java.util.List;

public interface ProductService {
    public PageInfo<Product> getProductPage(Integer pg);

    public void delProduct(Integer id);

    public void batchDeleteByIds(List<Integer> ids);

    public PageInfo<Product> searchProduct(Integer pg, SearchParam searchParam);

    public void offSlef(List<Integer> ids);

    public void shelves(List<Integer> ids);

    public PageInfo<Product> getProductByStatusPage(Integer pg,Integer status);

    public void addProduct(Product product);

    public void updateProduct(Product product);

}
