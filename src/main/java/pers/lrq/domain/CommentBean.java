package pers.lrq.domain;

import java.io.Serializable;

public class CommentBean implements Serializable {

    private int uid;
    private int tid;
    private int fid;
    private String content;
    private int score;
    private String date;
    private String username;
    private String name;
    private double averge;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public double getAverge() {
        return averge;
    }

    public void setAverge(double averge) {
        this.averge = averge;
    }

    @Override
    public String toString() {
        return "CommentBean{" +
                "uid=" + uid +
                ", tid=" + tid +
                ", fid=" + fid +
                ", content='" + content + '\'' +
                ", score=" + score +
                ", date='" + date + '\'' +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", averge=" + averge +
                '}';
    }
}
