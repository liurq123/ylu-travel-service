package pers.lrq.domain;

import java.io.Serializable;

public class TravelNoteBean implements Serializable {
    private int yjid;
    private int uid;
    private  String username;
    private String name;
    private String date;
    private String title;
    private String cover;
    private String godate;
    private int daynumber;
    private String who;
    private int avgmoney;
    private String thinking;
    private String touTitle1;
    private String touThinking1;
    private String img1;
    private String touTitle2;
    private String touThinking2;
    private String img2;
    private String touTitle3;
    private String touThinking3;
    private String img3;
    private String summary;

    public int getYjid() {
        return yjid;
    }

    public void setYjid(int yjid) {
        this.yjid = yjid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getGodate() {
        return godate;
    }

    public void setGodate(String godate) {
        this.godate = godate;
    }

    public int getDaynumber() {
        return daynumber;
    }

    public void setDaynumber(int daynumber) {
        this.daynumber = daynumber;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public int getAvgmoney() {
        return avgmoney;
    }

    public void setAvgmoney(int avgmoney) {
        this.avgmoney = avgmoney;
    }

    public String getThinking() {
        return thinking;
    }

    public void setThinking(String thinking) {
        this.thinking = thinking;
    }

    public String getTouTitle1() {
        return touTitle1;
    }

    public void setTouTitle1(String touTitle1) {
        this.touTitle1 = touTitle1;
    }

    public String getTouThinking1() {
        return touThinking1;
    }

    public void setTouThinking1(String touThinking1) {
        this.touThinking1 = touThinking1;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getTouTitle2() {
        return touTitle2;
    }

    public void setTouTitle2(String touTitle2) {
        this.touTitle2 = touTitle2;
    }

    public String getTouThinking2() {
        return touThinking2;
    }

    public void setTouThinking2(String touThinking2) {
        this.touThinking2 = touThinking2;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getTouTitle3() {
        return touTitle3;
    }

    public void setTouTitle3(String touTitle3) {
        this.touTitle3 = touTitle3;
    }

    public String getTouThinking3() {
        return touThinking3;
    }

    public void setTouThinking3(String touThinking3) {
        this.touThinking3 = touThinking3;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "TravelNoteBean{" +
                "yjid=" + yjid +
                ", uid=" + uid +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", cover='" + cover + '\'' +
                ", godate='" + godate + '\'' +
                ", daynumber=" + daynumber +
                ", who='" + who + '\'' +
                ", avgmoney=" + avgmoney +
                ", thinking='" + thinking + '\'' +
                ", touTitle1='" + touTitle1 + '\'' +
                ", touThinking1='" + touThinking1 + '\'' +
                ", img1='" + img1 + '\'' +
                ", touTitle2='" + touTitle2 + '\'' +
                ", touThinking2='" + touThinking2 + '\'' +
                ", img2='" + img2 + '\'' +
                ", touTitle3='" + touTitle3 + '\'' +
                ", touThinking3='" + touThinking3 + '\'' +
                ", img3='" + img3 + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }
}
