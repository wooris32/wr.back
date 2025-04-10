package wr.app.entity.book;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import wr.app.entity.BaseEntity;


@Entity
@Getter @Setter
@Table(name = "w_book_h")
public class BookH extends BaseEntity {

    @Id
    @Column(name="BOOK_ID")
    private Long bookId;

    private String comment;


    /*BOOK_ST_TIME	DATETIME	,
    BOOK_EN_TIME	DATETIME	,
    BOOK_CD	VARCHAR(5)	,
    SALE_ID	BIGINT	,
    COMMENT	VARCHAR(1000)	,
    DB_STS	VARCHAR(5)	,
    C_ID	BIGINT	,
    C_DATE	DATETIME	,
    U_ID	BIGINT	,
    U_DATE	DATETIME;
    private Long client_id;
    book_st_time	datetime	,
    book_en_time	datetime	,
    book_sts varchar(5)	,
    sale_id	bigint	,
    comment	varchar(1000)	,
    */
}
