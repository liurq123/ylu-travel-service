package pers.lrq.mapper;


import pers.lrq.domain.SelectShowList;

import java.util.List;

public interface GetShowListMapper {
    public List<SelectShowList> getSelectShowList(Integer page);

    //通过id查找select的showlist对象
    public SelectShowList getSelectShowById(Integer id);

     //查找delicious的showlist对象
    public List<SelectShowList> getDeliciousShowList(Integer page);

    //通过id查找delicious的showlist对象
    public SelectShowList getDeliciousShowById(Integer id);
}


