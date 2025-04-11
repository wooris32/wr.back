package wr.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wr.app.dto.ResultDto;
import wr.app.dto.book.BookHDTO;
import wr.app.entity.book.BookHEntity;
import wr.app.service.book.BookService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @PostMapping(value = "/create")
    public ResponseEntity<ResultDto> createBook(@RequestBody BookHDTO bookHDTO){
        BookHEntity be = new BookHEntity();
        ResultDto resultDto = bookService.createBook(be);

        return ResponseEntity.ok(resultDto);
    }
}
