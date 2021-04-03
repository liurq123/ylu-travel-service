package pers.lrq.domain;

import java.io.Serializable;

public class SelectShowList implements Serializable {
    private int tid;
    private int fid;
    private String title;
    private String address;
    private double price;
    private String cover;
    private String intro;
    private String openTime;


    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    @Override
    public String toString() {
        return "SelectShowList{" +
                "tid=" + tid +
                ", fid=" + fid +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", cover='" + cover + '\'' +
                ", intro='" + intro + '\'' +
                ", openTime='" + openTime + '\'' +
                '}';
    }
}
