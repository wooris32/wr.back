package wr.app.service.impl.book;

import org.springframework.stereotype.Service;
import wr.app.dto.ResultDto;
import wr.app.entity.book.BookHEntity;
import wr.app.service.book.BookService;

import java.util.ArrayList;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public ResultDto createBook(BookHEntity bookH){

        //Shop의 예약 Type을 확인한다.

        //예약 Type 1:1 (디자이너 형 - 1인샵, 다인샵) /  N:N (카운터 형 - 1인샵, 다인샵)

        // 1:1 Type 샵의 경우
        // 예약 만들기
        // 예약 막기 I/F

        // N:N' 인 경우
        // i) N 이 1 type일 경우
        // 예약 만들기
        // 예약 막기 I/F
        // 샵의 예약 가능 count--

        // ii) N 이 N type일 경우
        // 예약 만들기
        // 예약 막기 I/F
        // 샵의 예약 가능 count--

        return new ResultDto("S","Success", new ArrayList<String>());
    }

}
