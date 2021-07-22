package com.example.demoautogeneratortype;

import com.example.demoautogeneratortype.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAutoGeneratorTypeApplication implements CommandLineRunner {

    private final BookService bookService;

    public DemoAutoGeneratorTypeApplication(BookService bookService) {
        this.bookService = bookService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoAutoGeneratorTypeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookService.persistAuthor();
    }
}
