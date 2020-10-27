package com.example.tesdb;

import com.example.tesdb.entity.Book;
import com.example.tesdb.repository.BookRepository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class TesdbApplication {


	public static void main(String[] args) {
		SpringApplication.run(TesdbApplication.class, args);


	}

}
