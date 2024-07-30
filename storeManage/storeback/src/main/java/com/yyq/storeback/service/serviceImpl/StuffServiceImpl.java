package com.yyq.storeback.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yyq.storeback.mapper.StuffMapper;
import com.yyq.storeback.pojo.Merchant;
import com.yyq.storeback.pojo.Product;
import com.yyq.storeback.pojo.SearchStuff;
import com.yyq.storeback.pojo.Stuff;
import com.yyq.storeback.service.StuffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StuffServiceImpl implements StuffService {
    @Autowired
    StuffMapper stuffMapper;

    @Override
    public PageInfo<Stuff> getStuffPage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum, 3);

        List<Stuff> list = stuffMapper.getStuffs();
        //获取分页相关数据
        PageInfo<Stuff> page = new PageInfo<>(list, 5);

        return page;
    }

    @Override
    public void delStuff(Integer id) {
        stuffMapper.delStuff(id);
    }

    @Override
    public PageInfo<Stuff> searchStuff(Integer pg, SearchStuff searchStuff) {

        PageHelper.startPage(pg, 3);

        List<Stuff> list = stuffMapper.searchStuff(searchStuff);
        //获取分页相关数据
        PageInfo<Stuff> page = new PageInfo<>(list, 5);

        return page;
    }
}
