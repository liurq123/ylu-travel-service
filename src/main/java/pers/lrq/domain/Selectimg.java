package pers.lrq.domain;

import java.io.Serializable;

public class Selectimg implements Serializable {
    private int tid;
    private String img;


    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


    @Override
    public String toString() {
        return "Selectimg{" +
                "tid=" + tid +
                ", img='" + img + '\'' +
                '}';
    }
}
