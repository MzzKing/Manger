package com.yyq.storeback.mapper;

import com.yyq.storeback.pojo.Supplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SupplierMapper {
    public List<Supplier> getSuppliers();
}
