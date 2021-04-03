package pers.lrq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.lrq.domain.Selectimg;
import pers.lrq.domain.SelectShowAndImg;
import pers.lrq.domain.SelectShowList;
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
    public SelectShowAndImg geSelectDetail(Integer tid) {
        // 获取showlist对象
        SelectShowList selectShowList = getShowListMapper.getSelectShowById(tid);

        // 获取img对象
        List<Selectimg> selectimgList = getImgDetailMapper.getSelectImgById(tid);

        SelectShowAndImg selectShowAndImg = new SelectShowAndImg(selectimgList, selectShowList);

        return selectShowAndImg;
    }

    @Override
    public SelectShowAndImg getDeliciousDetail(Integer fid) {
        SelectShowList selectShowList = getShowListMapper.getDeliciousShowById(fid);
        List<Selectimg> deliciousImgList = getImgDetailMapper.getDeliciousImgById(fid);
        SelectShowAndImg selectShowAndImg = new SelectShowAndImg(deliciousImgList,selectShowList);
        return selectShowAndImg;
    }


}
