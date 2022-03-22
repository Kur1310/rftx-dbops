package com.bv.gcp.dbops.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Data
@Entity(name = "FEED_INSTANCE")
public class FeedInstance {

    @Id
    @Column(name="FEED_INSTANCE_KEY", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fikGen")
    @SequenceGenerator(name="fikGen", sequenceName = "FEED_INSTANCE_KEY_SEQ", allocationSize = 1)
    private Long feedInstanceKey;

    @ManyToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name="FEED_KEY", referencedColumnName = "FEED_KEY", nullable = false)
    private Feed feedId;

    @Column(name="FILE_NAME")
    private String fileName;

    @Column(name="BUS_RPT_DATE")
    private Date busRptDate;

    @Column(name="FEED_ARRIVAL_TIME")
    private Timestamp arrivalTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedInstance feed = (FeedInstance) o;
        return Objects.equals(feedInstanceKey, feed.feedInstanceKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedInstanceKey);
    }

    @Override
    public String toString() {
        return "FeedInstance{" +
                "feedInstanceKey=" + feedInstanceKey +
                ", feedId=" + feedId +
                ", fileName='" + fileName + '\'' +
                ", busRptDate=" + busRptDate +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
