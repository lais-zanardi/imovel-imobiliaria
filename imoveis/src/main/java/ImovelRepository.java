import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends CrudRepository<Imovel, String> {
}