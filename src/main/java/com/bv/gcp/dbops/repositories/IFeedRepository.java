package com.bv.gcp.dbops.repositories;

import com.bv.gcp.dbops.domain.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFeedRepository extends JpaRepository<Feed, Long> {
}
