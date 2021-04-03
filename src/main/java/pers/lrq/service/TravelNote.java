package pers.lrq.service;

import pers.lrq.domain.TravelNoteBean;

import java.util.List;

public interface TravelNote {
    public int addTravelNote(TravelNoteBean travelNoteBean);

    public List<TravelNoteBean> getTravelNote();

    public TravelNoteBean getTravelById(Integer yjid);
}
