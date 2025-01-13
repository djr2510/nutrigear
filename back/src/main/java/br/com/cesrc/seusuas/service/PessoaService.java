package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.PessoaModel;
import br.com.cesrc.seusuas.repository.PessoaRepository;
import br.com.cesrc.seusuas.controller.request.PessoaRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;
    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }
    public PessoaModel salvarAcolhido (PessoaModel pessoa){
        return pessoaRepository.save(pessoa);
    }
    public void deletarAcolhido (Long id){
        pessoaRepository.deleteById(id);
    }
    public List<PessoaModel> listarAcolhido(){
        return pessoaRepository.findAll();
    }
    public void editarAcolhido(Long id, PessoaRequest pessoaRequest){
        PessoaModel acolhidoExistente = pessoaRepository.findById(id).orElseThrow(() -> new RuntimeException(id +" não existe"));
        acolhidoExistente.setNome(pessoaRequest.getNome());
        acolhidoExistente.setDataNascimento(pessoaRequest.getDataNascimento());
        pessoaRepository.save(acolhidoExistente);
    }
}
