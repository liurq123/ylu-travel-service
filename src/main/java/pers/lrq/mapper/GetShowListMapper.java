package pers.lrq.mapper;


import pers.lrq.domain.SelectShowList;

import java.util.List;

public interface GetShowListMapper {
    public List<SelectShowList> getSelectShowList(Integer page);

    //通过id查找showlist对象
     public SelectShowList getSelectShowById(Integer id);
}


