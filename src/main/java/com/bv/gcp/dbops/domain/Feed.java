package com.bv.gcp.dbops.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Data
@Entity(name = "FEED")
public class Feed {

    @Id
    @Column(name="FEED_KEY", nullable = false)
    private Long id;

    @Column(name="FEED_ID", nullable = false)
    private String feedId;

    @Column(name="FEED_NAME", nullable = false)
    private String feedName;

    @Column(name="FEED_TYPE")
    private String feedType;

    @Column(name="SOURCE_ID")
    private String sourceId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feed feed = (Feed) o;
        return Objects.equals(id, feed.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Feed{" +
                "id=" + id +
                ", feedId='" + feedId + '\'' +
                ", feedName='" + feedName + '\'' +
                ", feedType='" + feedType + '\'' +
                ", sourceId='" + sourceId + '\'' +
                '}';
    }
}
