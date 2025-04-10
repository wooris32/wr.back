package wr.app.repository.book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import wr.app.entity.book.BookH;

@Repository
public class BookHRepository {

    @PersistenceContext
    EntityManager em;

    public Long save (BookH bookH){
        em.persist(bookH);

        return bookH.getBookId();
    }

    public BookH find(Long bookId){
        return em.find(BookH.class, bookId);
    }


}
