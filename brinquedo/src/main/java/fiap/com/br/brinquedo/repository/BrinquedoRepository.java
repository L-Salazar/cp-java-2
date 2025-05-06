package fiap.com.br.brinquedo.repository;

import fiap.com.br.brinquedo.model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {
}
