package gestaoeventos.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notificacao")
public class Notificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false, length = 40)
    private TipoNotificacao tipo;

    @Column(name = "conteudo", nullable = false, length = 500)
    private String conteudo;

    @Column(name = "canal", length = 40)
    private String canal;

    @Column(name = "lida", nullable = false)
    private boolean lida = false;

    @Column(name = "data_criacao", nullable = false)
    private LocalDateTime dataCriacao = LocalDateTime.now();

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "destinatario_numero",
            foreignKey = @ForeignKey(name = "fk_notificacao_destinatario")
    )
    private Utilizador destinatario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "evento_id",
            foreignKey = @ForeignKey(name = "fk_notificacao_evento")
    )
    private Evento eventoRelacionado;

    public Notificacao() {
    }

    // getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoNotificacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoNotificacao tipo) {
        this.tipo = tipo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public boolean isLida() {
        return lida;
    }

    public void setLida(boolean lida) {
        this.lida = lida;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Utilizador getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Utilizador destinatario) {
        this.destinatario = destinatario;
    }

    public Evento getEventoRelacionado() {
        return eventoRelacionado;
    }

    public void setEventoRelacionado(Evento eventoRelacionado) {
        this.eventoRelacionado = eventoRelacionado;
    }
}
