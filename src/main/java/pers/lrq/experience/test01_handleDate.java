package pers.lrq.experience;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test01_handleDate {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(date);
        System.out.println(dateNowStr);

    }
}
