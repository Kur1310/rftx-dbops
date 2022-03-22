package com.bv.gcp.dbops.controller;

import com.bv.gcp.dbops.domain.Feed;
import com.bv.gcp.dbops.domain.FeedInstance;
import com.bv.gcp.dbops.service.OpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OperationsController {

    public static final String FEED_INSTANCE = "/feed-instance";
    public static final String FEED = "/feed";

    @Autowired
    private OpsService opsService;

    @PostMapping(value = FEED_INSTANCE)
    public FeedInstance persistFeedInstance(@RequestBody FeedInstance feedInstance){
        return opsService.persistFeedInstance(feedInstance);
    }

    @PostMapping(value = FEED)
    public Feed persistFeed(@RequestBody Feed feed){
        return opsService.persistFeed(feed);
    }

    @GetMapping(value = FEED_INSTANCE)
    public List<FeedInstance> getFeedInstance(){
        return opsService.getFeedInstance();
    }

    @GetMapping(value = FEED)
    public List<Feed> getFeed(){
        return opsService.getFeed();
    }


    @GetMapping(value = "/ping")
    public String ping(){
        return "Ok";
    }
}
