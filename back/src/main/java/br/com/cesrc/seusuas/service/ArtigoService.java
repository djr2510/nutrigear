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
    //Salvar Artigo
    public ArtigoModel salvarArtigo (ArtigoModel artigo){
        return artigoRepository.save(artigo);
    }
    //Deletar Artigo
    public void deletarArtigo (Long id){
        artigoRepository.deleteById(id);
    }
    //Service
    //Procurar Por Titulo
    public void procurarPorTitulo (String titulo){artigoRepository.findByNomeContaining(titulo);}
    //Procurar Todos
    public List<ArtigoModel> listarArtigos(){
        return artigoRepository.findAll();
    }
    //Listar Por Data Desc
    public List<ArtigoModel> listarArtigosPorDataCriacaoDesc(){return artigoRepository.findAllOrderBydataCriacaoDesc();}
    //Listar Por Data Asc
    public List<ArtigoModel> listarArtigosPorDataCriacaoAsc(){return artigoRepository.findAllOrderBydataCriacaoAsc();}

}
