package wr.app.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public abstract class BaseEntity {

    @Column(length = 5)
    private String dbSts;

    @CreatedBy
    @Column(updatable = false, length = 10)
    private String cId;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime cDate;

    @LastModifiedBy
    @Column(length = 10)
    private String uId;

    @LastModifiedDate
    private LocalDateTime uDate;
}