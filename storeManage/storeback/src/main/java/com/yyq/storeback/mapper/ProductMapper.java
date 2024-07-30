package com.yyq.storeback.mapper;

import com.yyq.storeback.pojo.Product;
import com.yyq.storeback.pojo.SearchParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
   public List<Product> getProducts();

   public void delProduct(Integer id);

   public void batchDeleteByIds(List<Integer> ids);

   public List<Product> searchProduct(SearchParam searchParam);

   public void offSlef(List<Integer> ids);

   public void shelves(List<Integer> ids);

   public List<Product> searchProductByStatus(Integer status);

    public void addProduct(Product product);

    public void updateProduct(Product product);

}
