package in.ashishmalunjkar.online.book.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashishmalunjkar.online.book.store.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
