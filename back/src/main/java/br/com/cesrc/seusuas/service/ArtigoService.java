package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.artigo.ArtigoModel;
import br.com.cesrc.seusuas.repository.ArtigoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtigoService {

    private final ArtigoRepository artigoRepository;

    public ArtigoService(ArtigoRepository artigoRepository) {
        this.artigoRepository = artigoRepository;
    }

    // Salvar Artigo
    public ArtigoModel salvarArtigo(ArtigoModel artigo) {
        return artigoRepository.save(artigo);
    }

    // Deletar Artigo
    public void deletarArtigo(Long id) {
        artigoRepository.deleteById(id);
    }

    // Procurar Artigos Por Título
    public List<ArtigoModel> procurarPorTitulo(String titulo) {
        return artigoRepository.findByTituloContaining(titulo);
    }

    // Listar Todos os Artigos
    public List<ArtigoModel> listarArtigos() {
        return artigoRepository.findAll();
    }

    // Listar Artigos por Data de Criação Descendente
    public List<ArtigoModel> listarArtigosPorDataCriacaoDesc() {
        return artigoRepository.findAllOrderByDataCriacaoDesc();
    }

    // Listar Artigos por Data de Criação Ascendente
    public List<ArtigoModel> listarArtigosPorDataCriacaoAsc() {
        return artigoRepository.findAllOrderByDataCriacaoAsc();
    }
}
