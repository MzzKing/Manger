package com.yyq.storeback.mapper;

import com.yyq.storeback.pojo.SearchStuff;
import com.yyq.storeback.pojo.Stuff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuffMapper {
    public List<Stuff> getStuffs();

    public void delStuff(Integer id);

    public List<Stuff> searchStuff(SearchStuff searchStuff);

}
