package in.ashishmalunjkar.online.book.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashishmalunjkar.online.book.store.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
