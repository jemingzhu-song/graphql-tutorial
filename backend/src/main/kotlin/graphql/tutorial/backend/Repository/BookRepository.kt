package graphql.tutorial.backend.Repository

import graphql.tutorial.backend.Book.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface BookRepository : JpaRepository<Book, Long> {
}