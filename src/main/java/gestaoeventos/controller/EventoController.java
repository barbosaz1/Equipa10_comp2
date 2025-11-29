package gestaoeventos.controller;

import gestaoeventos.dto.EventoCreateDTO;
import gestaoeventos.dto.EventoDTO;
import gestaoeventos.service.EventoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {
	
	private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }
    
    @GetMapping("/search")
    public List<EventoDTO> pesquisar(@RequestParam(required = false) String inicio,@RequestParam(required = false) String fim,@RequestParam(required = false) String tipo,@RequestParam(required = false) Integer localId,@RequestParam(required = false) Integer organizadorNumero) {
        return eventoService.pesquisar(inicio, fim, tipo, localId, organizadorNumero);
    }

    @GetMapping
    public List<EventoDTO> listar() {
        return eventoService.listarTodos();
    }

    @GetMapping("/{id}")
    public EventoDTO obter(@PathVariable Integer id) {
        return eventoService.obterPorId(id);
    }

}
