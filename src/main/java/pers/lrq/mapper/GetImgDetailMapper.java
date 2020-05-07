package pers.lrq.mapper;

import pers.lrq.domain.Selectimg;

import java.util.List;

public interface GetImgDetailMapper {
    public List<Selectimg> getSelectImgById(Integer tid);
}
