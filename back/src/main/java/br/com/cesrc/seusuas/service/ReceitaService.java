package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.receita.ReceitaModel;
import br.com.cesrc.seusuas.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceitaService {

    private final ReceitaRepository receitaRepository;

    @Autowired
    public ReceitaService(ReceitaRepository receitaRepository) {
        this.receitaRepository = receitaRepository;
    }

    public ReceitaModel salvarReceita(ReceitaModel receita) {
        return receitaRepository.save(receita);
    }

    public List<ReceitaModel> buscarPorTitulo(String titulo) {
        return receitaRepository.findByTituloContainingIgnoreCase(titulo); // Agora ignorando maiúsculas/minúsculas
    }

    public List<ReceitaModel> buscarTodasOrdenadasPorDataAsc() {
        return receitaRepository.findAllByOrderByDataCriacaoAsc();
    }

    public List<ReceitaModel> buscarTodasOrdenadasPorDataDesc() {
        return receitaRepository.findAllByOrderByDataCriacaoDesc();
    }

    public Optional<ReceitaModel> buscarPorId(Long id) {
        return receitaRepository.findById(id);
    }

    public List<ReceitaModel> buscarPorRestricaoAlimentar(String restricao) {
        return receitaRepository.findByRestricaoAlimentar(restricao);
    }

    public List<ReceitaModel> buscarPorOpcaoAlimentar(String opcao) {
        return receitaRepository.findByOpcaoAlimentar(opcao);
    }

    public List<ReceitaModel> buscarPorTituloOuDescricao(String titulo, String descricao) {
        return receitaRepository.findByTituloOrDescricao(titulo, descricao);
    }
}
