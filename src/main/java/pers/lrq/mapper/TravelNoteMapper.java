package pers.lrq.mapper;

import pers.lrq.domain.TravelNoteBean;

import java.util.List;

public interface TravelNoteMapper {
    public int addTravelNote(TravelNoteBean travelNoteBean);

    public List<TravelNoteBean> getTravelNote();

    public TravelNoteBean getTravelNoteById(Integer yjid);
}
