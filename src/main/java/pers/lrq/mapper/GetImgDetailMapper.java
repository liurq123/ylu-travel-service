package pers.lrq.mapper;

import pers.lrq.domain.Dimg;

import java.util.List;

public interface GetImgDetailMapper {
    public List<Dimg> getImgById(Integer rid);
}
