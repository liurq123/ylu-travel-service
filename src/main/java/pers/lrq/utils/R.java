package pers.lrq.utils;
/*
    返回相应的成功或错误消息
 */
public class R {
    private int code;
    private String msg;

    public R(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
