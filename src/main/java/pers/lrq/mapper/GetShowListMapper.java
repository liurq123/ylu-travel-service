package pers.lrq.mapper;


import pers.lrq.domain.ShowList;

import java.util.List;

public interface GetShowListMapper {
    public List<ShowList> getShowList(Integer page);

    //通过id查找showlist对象
     public ShowList getShowById(Integer id);
}


