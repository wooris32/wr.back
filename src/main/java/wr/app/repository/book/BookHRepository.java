package wr.app.repository.book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import wr.app.entity.book.BookHEntity;

@Repository
public class BookHRepository {

    @PersistenceContext
    EntityManager em;

    public Long save(BookHEntity bookH){
        em.persist(bookH);

        return bookH.getBookId();
    }

    public BookHEntity find(Long bookId){
        return em.find(BookHEntity.class, bookId);
    }


}
