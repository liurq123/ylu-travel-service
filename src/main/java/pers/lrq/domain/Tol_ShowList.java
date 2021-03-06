package pers.lrq.domain;

import java.io.Serializable;
import java.util.List;

public class Tol_ShowList<T> implements Serializable {
    private List<T> data;
    private boolean hasMore;

    public Tol_ShowList(List<T> data, boolean hasMore){
        this.data = data;
        this.hasMore = hasMore;
    }


    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    @Override
    public String toString() {
        return "Tol_ShowList{" +
                "data=" + data +
                ", hasMore=" + hasMore +
                '}';
    }
}
