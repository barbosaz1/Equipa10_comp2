package gestaoeventos.repository;

import gestaoeventos.entity.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {

    List<Inscricao> findByEventoId(Integer eventoId);

    List<Inscricao> findByUtilizadorNumero(Integer numero);
}
