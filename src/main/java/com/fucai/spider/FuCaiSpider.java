package com.fucai.spider;

import com.fucai.dto.BasePeriodDTO;
import com.fucai.service.BasePeriodService;
import com.fucai.service.impl.BasePeriodServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/1.
 */
@Component
@EnableScheduling
public class FuCaiSpider implements PageProcessor {

    //private static Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(2000);
    private static Logger logger = Logger.getLogger(FuCaiSpider.class);

    @Autowired
    private BasePeriodService basePeriodService;

    @Override
    public void process(Page page) {
        //logger.info(page);
        List<BasePeriodDTO> basePeriodDTOList = new ArrayList<BasePeriodDTO>();
        //获取球号
        List<String> balls = page.getHtml().xpath("//table[@class='hz']/tbody/tr/td/p[@class='haoma tc']/span/text()").all();
        //获取期号
        List<String> periods = page.getHtml().xpath("//table[@class='hz']/tbody/tr/td[1]/text()").all();
        BasePeriodDTO basePeriodDTO = new BasePeriodDTO();
        for(int i = 0;i < balls.size();i++){
            String ball = balls.get(i);
            //判断红球和蓝球
            if(i != 0 && (i+1) % 7 == 0){
                basePeriodDTO.setBlueBall(ball.substring(0,2));
                //获取期号
                String periodNumber = periods.get((i+1)/7+1);
                basePeriodDTO.setPeriodNumber(periodNumber);
                //蓝球结束同时写入集合
                basePeriodDTOList.add(basePeriodDTO);
                basePeriodDTO = new BasePeriodDTO();
            }else {
                int remainder = (i+1) % 7;
                switch (remainder){
                    case 1:
                        basePeriodDTO.setRedOneBall(ball);
                        break;
                    case 2:
                        basePeriodDTO.setRedTwoBall(ball);
                        break;
                    case 3:
                        basePeriodDTO.setRedThreeBall(ball);
                        break;
                    case 4:
                        basePeriodDTO.setRedFourBall(ball);
                        break;
                    case 5:
                        basePeriodDTO.setRedFiveBall(ball);
                        break;
                    default:
                        basePeriodDTO.setRedSixBall(ball);
                }
            }
        }
        page.putField("basePeriodDTOList",basePeriodDTOList);
        List<String> links = page.getHtml().css("div.pagebar").links().regex("index_.*.shtml").all();
        page.addTargetRequests(links);
    }

    @Override
    public Site getSite() {
        //return site;
        return Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(2000);
    }


    @Scheduled(cron = "${fucai.beign.time}")
    public  void fucaiSpider(){
        Spider.create(new FuCaiSpider())
                .addUrl("http://www.cwl.gov.cn/kjxx/ssq/hmhz/")
                .addPipeline(basePeriodService)
                .run();
    }
}
