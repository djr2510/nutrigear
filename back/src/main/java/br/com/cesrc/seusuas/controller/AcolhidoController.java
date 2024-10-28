package br.com.cesrc.seusuas.controller;

import br.com.cesrc.seusuas.controller.response.AcolhidoResponse;
import br.com.cesrc.seusuas.controller.request.AcolhidoRequest;
import br.com.cesrc.seusuas.model.Acolhido;
import br.com.cesrc.seusuas.repository.AcolhidoRepository;
import br.com.cesrc.seusuas.service.AcolhidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping(path="/acolhido")
@RestController
public class AcolhidoController {
    private AcolhidoService acolhidoService;
    private AcolhidoRepository acolhidoRepository;

    public AcolhidoController(AcolhidoService acolhidoService, AcolhidoRepository acolhidoRepository) {
        this.acolhidoService = acolhidoService;
        this.acolhidoRepository = acolhidoRepository;
    }


    @GetMapping
    public ResponseEntity<List<AcolhidoResponse>> listarAcolhidos(@RequestParam(required = false)Long id){

        List<Acolhido> acolhidos = acolhidoRepository.findAll();
        List<AcolhidoResponse> responseList = acolhidos.stream()
                .map(AcolhidoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
     }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> salvarAcolhido(@RequestBody AcolhidoRequest acolhidoRequest){
        Acolhido acolhido = acolhidoRequest.toModel();
        acolhidoService.salvarAcolhido(acolhido);
        return ResponseEntity.created(URI.create("/acolhido")).build();
    }
}
