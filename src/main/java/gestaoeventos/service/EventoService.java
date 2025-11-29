/**
 * @author FA507
 */
package gestaoeventos.service;

import gestaoeventos.dto.EventoCreateDTO;
import gestaoeventos.dto.EventoDTO;
import gestaoeventos.entity.EstadoEvento;
import gestaoeventos.entity.EstadoInscricao;
import gestaoeventos.entity.Evento;
import gestaoeventos.entity.Inscricao;
import gestaoeventos.entity.ListaEspera;
import gestaoeventos.entity.Local;
import gestaoeventos.entity.LogAuditoria;
import gestaoeventos.entity.TipoEvento;
import gestaoeventos.entity.Utilizador;
import gestaoeventos.exception.BusinessException;
import gestaoeventos.exception.NotFoundException;
import gestaoeventos.repository.EventoRepository;
import gestaoeventos.repository.InscricaoRepository;
import gestaoeventos.repository.ListaEsperaRepository;
import gestaoeventos.repository.LocalRepository;
import gestaoeventos.repository.LogAuditoriaRepository;
import gestaoeventos.repository.UtilizadorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */
public class EventoService {

}
