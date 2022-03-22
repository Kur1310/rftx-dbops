package com.bv.gcp.dbops.repositories;

import com.bv.gcp.dbops.domain.FeedInstance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFeedInstanceRepository extends JpaRepository<FeedInstance, Long> {
}
