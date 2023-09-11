package graphql.tutorial.backend.Author

import graphql.tutorial.backend.Book.Book
import jakarta.persistence.*

@Entity
class Author(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false)
    private var id: Long?,
    @Column(name = "name", nullable = false)
    private var name: String,
    @OneToMany(mappedBy = "author", cascade = arrayOf(CascadeType.ALL))
    private var books: MutableList<Book> = mutableListOf()
) {

}