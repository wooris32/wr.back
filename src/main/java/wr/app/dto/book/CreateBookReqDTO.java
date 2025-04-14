package wr.app.dto.book;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class CreateBookReqDTO {
    Long shopId;
    String clientName;
    String clientPhoneNo;
    LocalDateTime bookStTime;
    LocalDateTime bookEnTime;
    String bookInfo;
    String bookSts;
    String comment;

    @Builder
    public CreateBookReqDTO(Long shopId, String clientName, String clientPhoneNo, LocalDateTime bookStTime, LocalDateTime bookEnTime, String bookInfo, String bookSts, String comment) {
        this.shopId = shopId;
        this.clientName = clientName;
        this.clientPhoneNo = clientPhoneNo;
        this.bookStTime = bookStTime;
        this.bookEnTime = bookEnTime;
        this.bookInfo = bookInfo;
        this.bookSts = bookSts;
        this.comment = comment;
    }

    public CreateBookReqDTO toEntity(){
        return CreateBookReqDTO.builder()
                .shopId(shopId)
                .clientName(clientName)
                .clientPhoneNo(clientPhoneNo)
                .bookStTime(bookStTime)
                .bookEnTime(bookEnTime)
                .bookInfo(bookInfo)
                .bookSts(bookSts)
                .comment(comment)
                .build();
    }
}
