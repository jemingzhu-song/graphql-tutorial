package graphql.tutorial.backend

import graphql.tutorial.backend.Author.Author
import graphql.tutorial.backend.Book.Book
import graphql.tutorial.backend.Repository.AuthorRepository
import graphql.tutorial.backend.Repository.BookRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class BackendApplication() {
	@Bean
	fun applicationRunner(authorRepository: AuthorRepository, bookRepository: BookRepository) = ApplicationRunner {
		var josh: Author = Author(null, "Josh Long")
		var mark: Author = Author(null, "Mark Heckler")
		authorRepository.save(josh)
		authorRepository.save(mark)
		bookRepository.saveAll(listOf(
			Book(null, "Reactive Spring", "Penguin", josh),
			Book(null, "Guide to System Design", "Riley", mark),
			Book(null, "Advanced Guide to System Design", "Riley", mark),
			Book(null, "Code for Dummies", "Australian Books", josh),
		))
	}
}

fun main(args: Array<String>) {
	runApplication<BackendApplication>(*args)
}
