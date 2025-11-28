package gestaoeventos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Utilizador {
    @Id
    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "password_hash", nullable = false, length = 255)
    private String passwordHash;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil", nullable = false, length = 20)
    private PerfilUtilizador perfil;

    @Column(name = "data_registo", nullable = false)
    private LocalDateTime dataRegisto = LocalDateTime.now();

    @Column(name = "ativo", nullable = false)
    private boolean ativo = true;
    
    //relacoes
    
    @JsonIgnore
    @OneToMany(mappedBy = "criador")
    private Set<Evento> eventosCriados = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "utilizador")
    private Set<Inscricao> inscricoes = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "utilizador")
    private Set<ListaEspera> entradasListaEspera = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "destinatario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Notificacao> notificacoes = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "autor")
    private Set<LogAuditoria> logsCriados = new HashSet<>();
    
    
}
