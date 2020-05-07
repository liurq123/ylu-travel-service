package pers.lrq.service;

import pers.lrq.domain.SelectShowList;

import java.util.List;

public interface GetShowList {

    //获取select（精选）的展示列表
    public List<SelectShowList> getSelectShowList(Integer page);
}
