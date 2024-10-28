package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.Acolhido;
import br.com.cesrc.seusuas.repository.AcolhidoRepository;
import br.com.cesrc.seusuas.controller.request.AcolhidoRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AcolhidoService {
    private final AcolhidoRepository acolhidoRepository;
    public AcolhidoService(AcolhidoRepository acolhidoRepository){
        this.acolhidoRepository = acolhidoRepository;
    }
    public Acolhido salvarAcolhido (Acolhido acolhido){
        return acolhidoRepository.save(acolhido);
    }
    public void deletarAcolhido (Long id){
        acolhidoRepository.deleteById(id);
    }
    public List<Acolhido> listarAcolhido(){
        return acolhidoRepository.findAll();
    }
    public void editarAcolhido(Long id, AcolhidoRequest acolhidoRequest){
        Acolhido acolhidoExistente = acolhidoRepository.findById(id).orElseThrow(() -> new RuntimeException(id +" não existe"));
        acolhidoExistente.setNome(acolhidoRequest.getNome());
        acolhidoExistente.setDataNascimento(acolhidoRequest.getDataNascimento());
        acolhidoRepository.save(acolhidoExistente);
    }
}
