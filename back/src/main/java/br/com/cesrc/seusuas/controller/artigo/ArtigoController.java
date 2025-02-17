package br.com.cesrc.seusuas.controller.artigo;

import br.com.cesrc.seusuas.controller.alimento.response.AlimentoResponse;
import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.repository.AlimentoRepository;
import br.com.cesrc.seusuas.repository.ArtigoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/artigos")
@RestController
public class ArtigoController {
    private ArtigoRepository artigoRepository;
}
