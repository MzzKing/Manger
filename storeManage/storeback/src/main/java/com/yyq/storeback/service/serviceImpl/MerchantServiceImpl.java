package com.yyq.storeback.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yyq.storeback.mapper.MerchantMapper;
import com.yyq.storeback.pojo.Merchant;
import com.yyq.storeback.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    @Override
    public List<Merchant> getMerchants() {
        return merchantMapper.getMercants();
    }

    @Override
    public PageInfo<Merchant> getMerchantPage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum, 3);
        List<Merchant> list = merchantMapper.getMercants();
        //获取分页相关数据
        PageInfo<Merchant> page = new PageInfo<>(list, 5);
        return page;
    }

    @Override
    public PageInfo<Merchant> getindustryPage(Integer pageNum,String industry) {
        //开启分页功能
        PageHelper.startPage(pageNum, 3);

        List<Merchant> list = merchantMapper.getMerchantsByIndustry(industry);
        //获取分页相关数据
        PageInfo<Merchant> page = new PageInfo<>(list, 5);
        return page;
    }

    @Override
    public PageInfo<Merchant> getsearchPage(Integer pageNum, String merchantName) {
        //开启分页功能
        PageHelper.startPage(pageNum, 3);

        List<Merchant> list = merchantMapper.getMerchantsByMerchantName(merchantName);
        //获取分页相关数据
        PageInfo<Merchant> page = new PageInfo<>(list, 5);

        return page;
    }

    @Override
    public List<Merchant> getMerchantsByIndustry(String industry) {
        return merchantMapper.getMerchantsByIndustry(industry);
    }

    @Override
    public List<Merchant> getMerchantsByMerchantName(String merchantName) {
        return merchantMapper.getMerchantsByMerchantName(merchantName);
    }

    @Override
    public void deleteMercantById(Integer merchantId) {
        merchantMapper.deleteMercantById(merchantId);
    }

    @Override
    public void addMerchant(Merchant merchant) {
        merchantMapper.addMerchant(merchant);
    }

    @Override
    public Merchant getMerchantById(Integer merchantId) {
        return merchantMapper.getMerchantById(merchantId);
    }

    @Override
    public void updateMerchant(Merchant merchant) {
        merchantMapper.updateMerchant(merchant);
    }
}
