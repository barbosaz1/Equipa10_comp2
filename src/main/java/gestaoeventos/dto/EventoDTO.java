package gestaoeventos.dto;

import gestaoeventos.entity.EstadoEvento;
import gestaoeventos.entity.TipoEvento;

import java.time.LocalDateTime;

public class EventoDTO {
	
	private Integer id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Integer maxParticipantes;
    private EstadoEvento estado;
    private TipoEvento tipo;
    private String areaTematica;
    private Integer criadorNumero;
    private Integer localId;
    private String motivoRemocao;

}
