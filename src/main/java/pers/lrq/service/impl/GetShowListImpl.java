package pers.lrq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.lrq.domain.ShowList;
import pers.lrq.mapper.GetShowListMapper;
import pers.lrq.service.GetShowList;

import java.util.List;

@Service
public class GetShowListImpl implements GetShowList {

    @Autowired
    private GetShowListMapper getShowListMapper;

    @Override
    public List<ShowList> getShowList(Integer page) {
//        System.out.println(getShowListMapper.getShowList(page));
        List<ShowList> result = null;
        //防止空指针异常
        try {
            result =  getShowListMapper.getShowList(page);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}
