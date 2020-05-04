package pers.lrq.utils;

import java.io.Serializable;

public class ResultInfo implements Serializable {
    private int code;
    private Object data;
    private String msg;

    // 有参构造函数
    public ResultInfo(int code,Object data){
        this.code = code;
        this.data = data;
    }

    public ResultInfo(int code,String msg){
        this.msg = msg;
        this.code = code;
    }

    public ResultInfo(int code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
