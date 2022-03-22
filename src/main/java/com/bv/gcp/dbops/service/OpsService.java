package com.bv.gcp.dbops.service;

import com.bv.gcp.dbops.domain.Feed;
import com.bv.gcp.dbops.domain.FeedInstance;
import com.bv.gcp.dbops.repositories.IFeedInstanceRepository;
import com.bv.gcp.dbops.repositories.IFeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpsService {

    @Autowired
    private IFeedRepository feedRepository;

    @Autowired
    private IFeedInstanceRepository feedInstanceRepository;

    public FeedInstance persistFeedInstance(FeedInstance feedInstance){
        return feedInstanceRepository.save(feedInstance);
    }

    public Feed persistFeed(Feed feed){
        return feedRepository.save(feed);
    }

    public List<FeedInstance> getFeedInstance(){
        return feedInstanceRepository.findAll();
    }

    public List<Feed> getFeed(){
        return feedRepository.findAll();
    }
}
