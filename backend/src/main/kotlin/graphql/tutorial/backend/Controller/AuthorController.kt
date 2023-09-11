package graphql.tutorial.backend.Controller

import graphql.tutorial.backend.Author.Author
import graphql.tutorial.backend.Book.Book
import graphql.tutorial.backend.Repository.AuthorRepository
import graphql.tutorial.backend.Repository.BookRepository
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class AuthorController(
    private val authorRepository: AuthorRepository,
    private val bookRepository: BookRepository
) {

    @QueryMapping
    fun authors(): Iterable<Author> {
        return authorRepository.findAll()
    }

    @QueryMapping
    fun authorById(@Argument id: Long): Optional<Author> {
        return authorRepository.findById(id)
    }

    @MutationMapping
    fun addBook(@Argument book: BookInput): Book {
        var author: Author = authorRepository.findById(book.authorId).orElseThrow()
        var newBook = Book(null, book.title, book.publisher, author)
        return bookRepository.save(newBook)
    }
}

data class BookInput(
    var title: String,
    var publisher: String,
    var authorId: Long,
)