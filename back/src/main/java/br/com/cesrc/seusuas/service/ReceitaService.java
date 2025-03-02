package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import br.com.cesrc.seusuas.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ReceitaService {

    private final ReceitaRepository receitaRepository;

    @Autowired
    public ReceitaService(ReceitaRepository receitaRepository) { this.receitaRepository = receitaRepository;}
    public ReceitaModel salvarReceita(ReceitaModel receita) {
        return receitaRepository.save(receita);
    }
    public List<ReceitaModel> buscarPorTitulo(String titulo) {
        return receitaRepository.findByNomeContaining(titulo);
    }
    public List<ReceitaModel> buscarTodasOrdenadasPorDataAsc() {
        return receitaRepository.findAllOrderBydataCriacaoAsc();
    }
    public List<ReceitaModel>  buscarTodasOrdenadasPorDataDesc(){
        return receitaRepository.findAllOrderBydataCriacaoDesc();
    }
    public Optional<ReceitaModel> buscarPorId(Long id) {
        return receitaRepository.findById(id);
    }
}
