package br.com.cesrc.seusuas.controller;

import br.com.cesrc.seusuas.controller.response.PessoaResponse;
import br.com.cesrc.seusuas.controller.request.PessoaRequest;
import br.com.cesrc.seusuas.model.PessoaModel;
import br.com.cesrc.seusuas.repository.PessoaRepository;
import br.com.cesrc.seusuas.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequestMapping(path="/pessoa")
@RestController
public class PessoaController {
    private PessoaService pessoaService;
    private PessoaRepository pessoaRepository;

    public PessoaController(PessoaService pessoaService, PessoaRepository pessoaRepository) {
        this.pessoaService = pessoaService;
        this.pessoaRepository = pessoaRepository;
    }


    @GetMapping
    public ResponseEntity<List<PessoaResponse>> listarPessoas(@RequestParam(required = false)Long id){

        List<PessoaModel> pessoas = pessoaRepository.findAll();
        List<PessoaResponse> responseList = pessoas.stream()
                .map(PessoaResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
     }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> salvarAcolhido(@RequestBody PessoaRequest pessoaRequest){
        PessoaModel pessoa = pessoaRequest.toModel();
        pessoaService.salvarAcolhido(pessoa);
        return ResponseEntity.created(URI.create("/acolhido")).build();
    }
}
