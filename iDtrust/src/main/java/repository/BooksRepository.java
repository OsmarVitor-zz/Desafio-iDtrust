package repository;

import com.mycompany.desafio.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long>{
    Book findById(long id);

    public List<Book> findByOne(String nameBook);
}


