package gestaoeventos.controller;

import gestaoeventos.dto.InscricaoDTO;
import gestaoeventos.service.InscricaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscricoes")
public class InscricaoController {
	private final InscricaoService inscricaoService;

    public InscricaoController(InscricaoService inscricaoService) {
        this.inscricaoService = inscricaoService;
    }
    @GetMapping("/evento/{eventoId}")
    public List<InscricaoDTO> listarPorEvento(@PathVariable Integer eventoId) {
        return inscricaoService.listarPorEvento(eventoId);
    }

    @GetMapping("/utilizador/{numero}")
    public List<InscricaoDTO> listarPorUtilizador(@PathVariable Integer numero) {
        return inscricaoService.listarPorUtilizador(numero);
    }
}
