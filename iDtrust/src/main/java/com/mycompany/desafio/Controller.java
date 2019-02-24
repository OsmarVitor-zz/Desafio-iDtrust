package com.mycompany.desafio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import repository.BooksRepository;

@RestController
public class Controller {

    public static final String KEY = "CxCPXBR3cyi0NxJgXbryA";

    @Autowired(required = true)
    BooksRepository userService;

    //return all books
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> listBooks() {
        return userService.findAll();
    }

    //return book by id
    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
    public Book getBook(@PathVariable(value = "id") long id) {
        return userService.findById(id);
    }

    //return book's author 
    @RequestMapping(value = "https://www.goodreads.com/search/index.xml?key=" + KEY + "?q={nameBook}", method = RequestMethod.GET)
    public List<Book> listBookForName(@PathVariable(value = "nameBook") String nameBook) {
        return userService.findBooksAuthor(nameBook);  //teste
    }
    
    //teste
    //return isbn number
    @RequestMapping(value="https://www.goodreads.com/book/isbn_to_id/{id}?key=" + KEY, method = RequestMethod.GET)
    public Book bookForIsbn(@PathVariable(value = "id") String isbn){
        return userService.findByIsbn(isbn);
    }
}
