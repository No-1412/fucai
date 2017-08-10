package com.fucai.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @author liaoyubo
 * @version 1.0 2017/3/31
 * @description
 */
public class GithubRepoPageProcessor implements PageProcessor {

    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);
    private static Logger logger = LoggerFactory.getLogger(GithubRepoPageProcessor.class);

    public void process(Page page) {
        page.addTargetRequests(page.getHtml().links().regex("(https://github\\.com/\\w+/\\w+)").all());
        page.putField("author",page.getUrl().regex("https://github\\.com/(\\w+)/.*").toString());
        page.putField("name",page.getHtml().xpath("//h1[@class='entry-title public']/strong/a/text()").toString());
        if(page.getResultItems().get("name") == null){
            page.setSkip(true);
        }
        page.putField("readme",page.getHtml().xpath("//div[@id='readme']/tidyText()"));
    }

    public Site getSite() {
        return site;
    }

    public static void main(String [] args){
        Spider.create(new GithubRepoPageProcessor())
                .addUrl("https://github.com/code4craft")
                .addPipeline(new ConsolePipeline())
                .thread(5)
                .run();
    }
}
