package pers.lrq.domain;

import java.io.Serializable;
import java.util.List;

public class ShowAndImg implements Serializable {
    private List<Dimg> dimg;
    private ShowList showList;

    public ShowAndImg(List<Dimg> dimg,ShowList showList){
        this.dimg = dimg;
        this.showList = showList;
    }

    public List<Dimg> getDimg() {
        return dimg;
    }

    public void setDimg(List<Dimg> dimg) {
        this.dimg = dimg;
    }

    public ShowList getShowList() {
        return showList;
    }

    public void setShowList(ShowList showList) {
        this.showList = showList;
    }
}
