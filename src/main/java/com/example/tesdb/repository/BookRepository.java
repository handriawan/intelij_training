package com.example.tesdb.repository;

import com.example.tesdb.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();

    List<Book> findAllByWriter(String writer);

    Book findByTitle(String title);
    Book findByIsbn(String isbn);


    //Pake native Query
    @Query(
            nativeQuery = true,
            value = "select * from book"
    )
    List<Book> findAllQueryNative();

    //pake native parameter
    @Query(
            nativeQuery = true,
            value = "select * from book where writer = ?1"
    )
    List<Book> findAllWriterQueryNative(String writer);

    //pake native query parameter isbn

    @Query(
            nativeQuery = true,
            value = "select * from book where isbn = ?1"
    )
    Book findByQueryNativeIsbn(String isbn);

    //pake native query parameter Title
    @Query(
            nativeQuery = true,
            value = "select * from book where title = ?1"
    )
    Book findByQueryNativeTitle(String title);

}
