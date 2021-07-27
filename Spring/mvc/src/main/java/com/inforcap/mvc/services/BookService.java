package com.inforcap.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.inforcap.mvc.models.Book;
import com.inforcap.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	 //Devolviendo todos los libros.
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    //Creando un libro.
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    //Obteniendo la información de un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional<Book> b = bookRepository.findById(id);
		b.get().setTitle(title);
		b.get().setDescription(desc);
		b.get().setLanguage(lang);
		b.get().setNumberOfPages(numOfPages);
		return bookRepository.save(b.get());
	}
	
	public Book updateBook(Book book) {
		bookRepository.save(book);
		return book;
	}
	
    
    
	
	
	
	
}	
