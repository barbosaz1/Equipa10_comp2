package gestaoeventos.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "inscricao",
        uniqueConstraints = @UniqueConstraint(
                name = "uk_inscricao_utilizador_evento",
                columnNames = {"utilizador_numero", "evento_id"}
        )
)
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_inscricao", nullable = false)
    private LocalDateTime dataInscricao = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, length = 20)
    private EstadoInscricao estado = EstadoInscricao.ATIVA;

    @Column(name = "check_in", nullable = false)
    private boolean checkIn = false;

    @Column(name = "qr_code_checkin", length = 100)
    private String qrCodeCheckIn;

    @Column(name = "validade_qrcode")
    private LocalDateTime validadeQRCode;

    @Column(name = "data_checkin")
    private LocalDateTime dataCheckIn;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "utilizador_numero",
            foreignKey = @ForeignKey(name = "fk_inscricao_utilizador")
    )
    private Utilizador utilizador;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "evento_id",
            foreignKey = @ForeignKey(name = "fk_inscricao_evento")
    )
    private Evento evento;

    public Inscricao() {
    }

    // getters e setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDateTime dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public EstadoInscricao getEstado() {
        return estado;
    }

    public void setEstado(EstadoInscricao estado) {
        this.estado = estado;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public String getQrCodeCheckIn() {
        return qrCodeCheckIn;
    }

    public void setQrCodeCheckIn(String qrCodeCheckIn) {
        this.qrCodeCheckIn = qrCodeCheckIn;
    }

    public LocalDateTime getValidadeQRCode() {
        return validadeQRCode;
    }

    public void setValidadeQRCode(LocalDateTime validadeQRCode) {
        this.validadeQRCode = validadeQRCode;
    }

    public LocalDateTime getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDateTime dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
