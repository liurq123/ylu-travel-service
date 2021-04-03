package pers.lrq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pers.lrq.domain.TravelNoteBean;
import pers.lrq.service.impl.TravelNoteImpl;
import pers.lrq.utils.ResultInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
    添加 游记
 */
@Controller
@CrossOrigin(origins="http://localhost:3000", allowCredentials="true")
public class TravelNoteController {

    @Autowired
    private TravelNoteImpl travelNote;


    @RequestMapping(value = "/addTripTravelNote",method = RequestMethod.POST)
    @ResponseBody
    public ResultInfo addTripTravelNote(@RequestBody TravelNoteBean travelNoteBean)  {
//        System.out.println(travelNoteBean);
        //给bean对象添加日期
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(date);
        travelNoteBean.setDate(dateNowStr);

        int result = travelNote.addTravelNote(travelNoteBean);

        if (result == 1){
            return new ResultInfo(1,"添加成功");
        }

        return new ResultInfo(0,"添加失败");
    }

    @RequestMapping(value = "getTripTravelNote",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getTravelNote(){
        List<TravelNoteBean> result = travelNote.getTravelNote();
        return new ResultInfo(1,result);
    }

    @RequestMapping(value = "/getTripTravelNoteById",method = RequestMethod.GET)
    @ResponseBody
    public ResultInfo getTravelNoteById(Integer yjid){
        TravelNoteBean travelNoteBean = travelNote.getTravelById(yjid);
        return new ResultInfo(1,travelNoteBean);
    }
}
