package wr.app.bookTest;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import wr.app.entity.book.BookH;
import wr.app.repository.book.BookHRepository;

@SpringBootTest
public class bookTest {

    @Autowired
    BookHRepository bookHRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testBookHRespository(){
        BookH bookH = new BookH();
        bookH.set
    }
}
