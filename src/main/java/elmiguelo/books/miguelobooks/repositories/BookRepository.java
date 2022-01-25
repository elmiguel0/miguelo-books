package elmiguelo.books.miguelobooks.repositories;

import elmiguelo.books.miguelobooks.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
