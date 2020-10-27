package com.example.tesdb;

import com.example.tesdb.entity.Book;
import com.example.tesdb.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRun  implements CommandLineRunner {

    private final Logger LOG = LoggerFactory.getLogger(MyRun.class);
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
//   // Create Record
//        Book book1 = new Book();
//
//		book1.setTitle("Belajar Spring JPA");
//		book1.setIsbn("ISBN 1234");
//		book1.setWriter("Iwan");
//
//		Book book2 = new Book();
//		book2.setTitle("Belajar Spring Repository");
//		book2.setIsbn("ISBN 2345");
//		book2.setWriter("Agus");
//
//		// Save pake Variable Reference Interface
//
//		bookRepository.save(book1);
//		bookRepository.save(book2);
//
//		LOG.info("Berhasil menyimpan "+ book1);
//		LOG.info("Berhasil menyimpan"+ book2);
//
//        bookRepository.findAll().forEach((book) -> {
//            LOG.info("{}", book);
//        });


//Cari Find All
//		List<Book> books = bookRepository.findAll();
//		LOG.info("Data buku : " + bookRepository.findAll());


//Cari Find by Writer
//	final String writer="Iwan";
//	List<Book> books = bookRepository.findAllByWriter(writer);
//	LOG.info("Data buku : " + books);

////cari Find by Title
//final String title="Belajar Spring JPA";
//Book book = bookRepository.findByTitle(title);
//LOG.info("Title : " + book);

////cari Find by ISBN
//final String isbn="ISBN 1234";
//Book book = bookRepository.findByIsbn(isbn);
//LOG.info("ISBN : " + book);

////pake native Query
//		List<Book> books = bookRepository.findAllQueryNative();
//		LOG.info("Data Buku : "+ bookRepository.findAllQueryNative());


//        // pake native Query ada parameter writer
//        final String writer="Iwan";
//        List<Book> book = bookRepository.findAllWriterQueryNative(writer);
//        LOG.info("Writer by native Query with Paramater writer : " + book);
//

//        // pake native Query ada parameter writer
//            final String isbn="ISBN 1234";
//            Book book = bookRepository.findByQueryNativeIsbn(isbn);
//            LOG.info("ISBn by Native Query Parameter ISBN : "+ book);

//         // pake nativ Query ada parameter Title
//              final String title="Belajar Spring JPA";
//              Book book = bookRepository.findByQueryNativeTitle(title);
//              LOG.info("Title Native Query Parameter Title : "+ book);




    }
}
