package pers.lrq.service;

import pers.lrq.domain.ShowList;

import java.util.List;

public interface GetShowList {

    //获取展示列表
    public List<ShowList> getShowList(Integer page);
}
