package graphql.tutorial.backend.Controller

import graphql.tutorial.backend.Book.Book
import graphql.tutorial.backend.Repository.AuthorRepository
import graphql.tutorial.backend.Repository.BookRepository
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(
    private val authorRepository: AuthorRepository,
    private val bookRepository: BookRepository
) {

    @QueryMapping
    fun getBooks(): Iterable<Book> {
        return bookRepository.findAll()
    }
}