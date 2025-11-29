package gestaoeventos.dto;

import java.time.LocalDateTime;

public class LogAuditoriaDTO {
	private Integer id;
    private String acao;
    private String entidade;
    private Integer entidadeId;
    private String motivo;
    private String ipOrigem;
    private LocalDateTime dataHora;
    private Integer autorNumero;

    public LogAuditoriaDTO() {}

}
