package pers.lrq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.lrq.domain.SelectShowList;
import pers.lrq.mapper.GetShowListMapper;
import pers.lrq.service.GetShowList;

import java.util.List;

@Service
public class GetShowListImpl implements GetShowList {

    @Autowired
    private GetShowListMapper getShowListMapper;


    @Override
    public List<SelectShowList> getSelectShowList(Integer page) {
        List<SelectShowList> result = null;
        //防止空指针异常
        try {
            result =  getShowListMapper.getSelectShowList(page);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public List<SelectShowList> getDelicious(Integer page) {
        List<SelectShowList> result = null;
        //防止空指针异常
        try {
            result =  getShowListMapper.getDeliciousShowList(page);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

}
