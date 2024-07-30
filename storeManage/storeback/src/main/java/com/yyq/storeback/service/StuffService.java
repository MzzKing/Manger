package com.yyq.storeback.service;

import com.github.pagehelper.PageInfo;
import com.yyq.storeback.pojo.Merchant;
import com.yyq.storeback.pojo.SearchStuff;
import com.yyq.storeback.pojo.Stuff;

public interface StuffService {
    public PageInfo<Stuff> getStuffPage(Integer pageNum);

    public void delStuff(Integer id);

    public PageInfo<Stuff> searchStuff(Integer pg, SearchStuff searchStuff);
}
