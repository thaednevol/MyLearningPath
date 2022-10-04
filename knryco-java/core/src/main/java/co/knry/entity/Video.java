package co.knry.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Date;
import java.util.UUID;

@Table
@Getter
@Setter
public class Video {
    @PrimaryKey
    private UUID id;

    private String tag;

    private String title;

    private Date addedDate;

}