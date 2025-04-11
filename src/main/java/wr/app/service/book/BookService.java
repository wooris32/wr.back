package wr.app.service.book;

import wr.app.dto.ResultDto;
import wr.app.entity.book.BookHEntity;

public interface BookService {
    ResultDto createBook(BookHEntity bookH);
}
