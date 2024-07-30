package com.yyq.storeback.service;


import com.github.pagehelper.PageInfo;
import com.yyq.storeback.pojo.Merchant;

import java.util.List;

public interface MerchantService {

    public List<Merchant> getMerchants();

    public PageInfo<Merchant> getMerchantPage(Integer pageNum);


    public PageInfo<Merchant> getindustryPage(Integer pageNum,String industry);

    public PageInfo<Merchant> getsearchPage(Integer pageNum,String merchantName);

    public List<Merchant> getMerchantsByIndustry(String industry);

    public List<Merchant> getMerchantsByMerchantName(String merchantName);

    public void deleteMercantById(Integer merchantId);

    public void addMerchant(Merchant merchant);

    public Merchant getMerchantById(Integer merchantId);

    public void updateMerchant(Merchant merchant);
}
