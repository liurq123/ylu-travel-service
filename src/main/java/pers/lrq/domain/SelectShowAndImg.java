package pers.lrq.domain;

import java.io.Serializable;
import java.util.List;

public class SelectShowAndImg implements Serializable {
    private List<Selectimg> selectimg;
    private SelectShowList selectShowList;

    public SelectShowAndImg(List<Selectimg> selectimg, SelectShowList selectShowList){
        this.selectimg = selectimg;
        this.selectShowList = selectShowList;
    }

    public List<Selectimg> getSelectimg() {
        return selectimg;
    }

    public void setSelectimg(List<Selectimg> selectimg) {
        this.selectimg = selectimg;
    }

    public SelectShowList getSelectShowList() {
        return selectShowList;
    }

    public void setSelectShowList(SelectShowList selectShowList) {
        this.selectShowList = selectShowList;
    }
}
