package pers.lrq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.lrq.domain.TravelNoteBean;
import pers.lrq.mapper.TravelNoteMapper;
import pers.lrq.service.TravelNote;

import java.util.List;

@Service
public class TravelNoteImpl implements TravelNote {

    @Autowired
    private TravelNoteMapper travelNoteMapper;

    @Override
    public int addTravelNote(TravelNoteBean travelNoteBean) {
        int result = travelNoteMapper.addTravelNote(travelNoteBean);
        return result;
    }

    @Override
    public List<TravelNoteBean> getTravelNote() {
        List<TravelNoteBean> result = travelNoteMapper.getTravelNote();
        return result;
    }

    @Override
    public TravelNoteBean getTravelById(Integer yjid) {
        TravelNoteBean travelNoteBean = travelNoteMapper.getTravelNoteById(yjid);
        return travelNoteBean;
    }
}
