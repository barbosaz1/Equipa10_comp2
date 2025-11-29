package gestaoeventos.repository;

import gestaoeventos.entity.Evento;
import gestaoeventos.entity.EstadoEvento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventoRepository extends JpaRepository<Evento, Integer> {

    List<Evento> findByEstado(EstadoEvento estado);
}
