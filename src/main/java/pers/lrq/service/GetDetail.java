package pers.lrq.service;

import pers.lrq.domain.SelectShowAndImg;

public interface GetDetail {
    public SelectShowAndImg geSelectDetail(Integer tid);

    public SelectShowAndImg getDeliciousDetail(Integer fid);
}
