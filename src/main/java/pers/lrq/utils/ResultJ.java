package pers.lrq.utils;

/*
    定义泛型，返回相应的对象
 */
public class ResultJ<E> {
    private int code;
    private E e;

    public ResultJ(int code,E e){
        this.code = code;
        this.e = e;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
