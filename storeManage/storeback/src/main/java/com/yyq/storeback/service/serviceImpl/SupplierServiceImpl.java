package com.yyq.storeback.service.serviceImpl;

import com.yyq.storeback.mapper.SupplierMapper;
import com.yyq.storeback.pojo.Supplier;
import com.yyq.storeback.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;

    @Override
    public List<Supplier> getSuppliers() {
        return supplierMapper.getSuppliers();
    }
}
