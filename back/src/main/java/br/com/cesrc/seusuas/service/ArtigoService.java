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
    public ArtigoModel salvarArtigo (ArtigoModel artigo){
        return artigoRepository.save(artigo);
    }
    public void deletarArtigo (Long id){
        artigoRepository.deleteById(id);
    }
    public void procurarPorTitulo (String titulo){artigoRepository.findByNomeContaining(titulo);}
    public List<ArtigoModel> listarArtigos(){
        return artigoRepository.findAll();
    }
    public List<ArtigoModel> listarArtigosPorDataCriacaoDesc(){return artigoRepository.findAllOrderBydataCriacaoDesc();}
    public List<ArtigoModel> listarArtigosPorDataCriacaoAsc(){return artigoRepository.findAllOrderBydataCriacaoAsc();}

}
