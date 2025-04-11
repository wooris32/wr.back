package wr.app.book;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import wr.app.entity.book.BookHEntity;
import wr.app.repository.book.BookHRepository;

@SpringBootTest
public class BookTest {

    @Autowired
    BookHRepository bookHRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testBookHRespository(){
        BookHEntity bookH = new BookHEntity();
        bookH.setComment("TEST");
        Long bookId = bookHRepository.save(bookH);
    }
}
