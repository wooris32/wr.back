package wr.app.entity.book;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "w_book_h")
public class Book_H {

    @Id
    @Column(name="BOOK_ID")
    private Long bookId;

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
    @Column(name="CLIENT_ID")
    private Long client_id;
    book_st_time	datetime	,
    book_en_time	datetime	,
    book_cd	varchar(5)	,
    sale_id	bigint	,
    comment	varchar(1000)	,
    db_sts	varchar(5)	,
    c_id	bigint	,
    c_date	datetime	,
    u_id	bigint	,
    u_date	datetime*/
}
