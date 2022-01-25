package elmiguelo.books.miguelobooks.repositories;

import elmiguelo.books.miguelobooks.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
