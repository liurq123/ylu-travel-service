package pers.lrq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.lrq.domain.Dimg;
import pers.lrq.domain.ShowAndImg;
import pers.lrq.domain.ShowList;
import pers.lrq.mapper.GetImgDetailMapper;
import pers.lrq.mapper.GetShowListMapper;
import pers.lrq.service.GetDetail;

import java.util.List;

@Service
public class GetDetailImpl implements GetDetail {

    @Autowired
    private GetImgDetailMapper getImgDetailMapper;

    @Autowired
    private GetShowListMapper getShowListMapper;

    @Override
    public ShowAndImg getDetail(Integer rid) {
        // 获取showlist对象
        ShowList showList = getShowListMapper.getShowById(rid);

        // 获取img对象
        List<Dimg> dimgList = getImgDetailMapper.getImgById(rid);

        ShowAndImg showAndImg = new ShowAndImg(dimgList,showList);

        return showAndImg;
    }
}
