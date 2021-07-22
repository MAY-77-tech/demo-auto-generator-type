package com.example.demoautogeneratortype.service;

import com.example.demoautogeneratortype.entity.Author;
import com.example.demoautogeneratortype.repo.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final AuthorRepository authorRepository;

    public BookService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void persistAuthor(){
        Author author = new Author();
        author.setName("John Willian");
        author.setAge(23);
        author.setGenre("History");

        authorRepository.save(author);

    }

}
