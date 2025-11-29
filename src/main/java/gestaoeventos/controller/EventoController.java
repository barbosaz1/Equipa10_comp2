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

}
