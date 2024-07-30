package com.yyq.storeback.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yyq.storeback.mapper.ProductMapper;
import com.yyq.storeback.pojo.Merchant;
import com.yyq.storeback.pojo.Product;
import com.yyq.storeback.pojo.SearchParam;
import com.yyq.storeback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;
    @Override
    public PageInfo<Product> getProductPage(Integer pg) {
        //开启分页功能
        PageHelper.startPage(pg, 3);

        List<Product> list = productMapper.getProducts();
        //获取分页相关数据
        PageInfo<Product> page = new PageInfo<>(list, 5);

        return page;
    }

    @Override
    public void delProduct(Integer id) {
        productMapper.delProduct(id);
    }

    @Override
    public void batchDeleteByIds(List<Integer> ids) {
        productMapper.batchDeleteByIds(ids);
    }

    @Override
    public PageInfo<Product> searchProduct(Integer pg, SearchParam searchParam){      //开启分页功能
        PageHelper.startPage(pg, 3);

        List<Product> list = productMapper.searchProduct(searchParam);
        //获取分页相关数据
        PageInfo<Product> page = new PageInfo<>(list, 5);

        return page;
    }

    @Override
    public void offSlef(List<Integer> ids) {

        productMapper.offSlef(ids);
    }

    @Override
    public void shelves(List<Integer> ids) {
        productMapper.shelves(ids);
    }

    @Override
    public PageInfo<Product> getProductByStatusPage(Integer pg,Integer status) {
        PageHelper.startPage(pg, 3);

        List<Product> list = productMapper.searchProductByStatus(status);
        //获取分页相关数据
        PageInfo<Product> page = new PageInfo<>(list, 5);

        return page;
    }

    @Override
    public void addProduct(Product product) {
        productMapper.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateProduct(product);
    }
}
