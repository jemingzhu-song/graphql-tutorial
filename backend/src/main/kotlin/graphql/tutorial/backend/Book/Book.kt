package graphql.tutorial.backend.Book

import graphql.tutorial.backend.Author.Author
import jakarta.persistence.*

@Entity
class Book(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false)
    private var id: Long?,
    @Column(name = "title", nullable = false)
    private var title: String,
    @Column(name = "publisher", nullable = false)
    private var publisher: String,
    @ManyToOne(fetch = FetchType.LAZY)
    private var author: Author
) {
}