package br.com.cesrc.seusuas.controller.alimento;

import br.com.cesrc.seusuas.controller.alimento.response.AlimentoResponse;
import br.com.cesrc.seusuas.controller.pessoa.response.PessoaResponse;
import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.repository.AlimentoRepository;
import br.com.cesrc.seusuas.repository.PessoaRepository;
import br.com.cesrc.seusuas.service.AlimentoService;
import br.com.cesrc.seusuas.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path="/alimento")
@RestController
public class AlimentoController {

private AlimentoService alimentoService;
private AlimentoRepository alimentoRepository;

    public AlimentoController (AlimentoService alimentoService, AlimentoRepository alimentoRepository) {
        this.alimentoService = alimentoService;
        this.alimentoRepository = alimentoRepository;
    }

    @GetMapping
    public ResponseEntity<List<AlimentoResponse>> listarAlimentos(@RequestParam(required = false)Long id){

        List<AlimentoModel> alimentos = alimentoRepository.findAll();
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }
    @GetMapping
    public ResponseEntity<List<AlimentoResponse>> listarAlimentosPorNome(@RequestParam(required = false)String nome){

        List<AlimentoModel> alimentos = alimentoRepository.findByNomeContaining(nome);
        List<AlimentoResponse> responseList = alimentos.stream()
                .map(AlimentoResponse::of)
                .toList();
        return ResponseEntity.ok(responseList);
    }
}

