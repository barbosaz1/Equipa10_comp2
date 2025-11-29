package gestaoeventos.repository;

import gestaoeventos.entity.ListaEspera;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListaEsperaRepository extends JpaRepository<ListaEspera, Integer> {

    List<ListaEspera> findByEventoIdOrderByDataEntradaAsc(Integer eventoId);
}

