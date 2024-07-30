package com.yyq.storeback.mapper;

import com.yyq.storeback.pojo.Merchant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MerchantMapper {

    public List<Merchant> getMercants();

    public List<Merchant> getMerchantsByIndustry(String industry);

    public List<Merchant> getMerchantsByMerchantName(String merchantName);

    public void deleteMercantById(Integer merchantId);

    public void addMerchant(Merchant merchant);

    public Merchant getMerchantById(Integer merchantId);

    public void updateMerchant(Merchant merchant);
}
