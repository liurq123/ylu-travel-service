package pers.lrq.domain;

import java.io.Serializable;

public class CommentBean implements Serializable {
    private String uid;
    private String tid;
    private String content;
    private String score;
    private String date;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CommentBean{" +
                "uid='" + uid + '\'' +
                ", tid='" + tid + '\'' +
                ", content='" + content + '\'' +
                ", score='" + score + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
