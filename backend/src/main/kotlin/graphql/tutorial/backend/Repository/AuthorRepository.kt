package graphql.tutorial.backend.Repository

import graphql.tutorial.backend.Author.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository : JpaRepository<Author, Long> {
}