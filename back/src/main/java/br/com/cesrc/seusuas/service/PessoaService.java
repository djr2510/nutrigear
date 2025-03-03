package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.repository.PessoaRepository;
import br.com.cesrc.seusuas.controller.pessoa.request.PessoaRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    public PessoaModel salvarPessoa (PessoaModel pessoa){
        return pessoaRepository.save(pessoa);
    }
    public void deletarPessoa(Long id) {
        if (!pessoaRepository.existsById(id)) {
            throw new RuntimeException("Pessoa com ID " + id + " não encontrada");
        }
        pessoaRepository.deleteById(id);
    }

    public List<PessoaModel> listarPessoa(){
        return pessoaRepository.findAll();
    }
    public void editarPessoa(Long id, PessoaRequest pessoaRequest){
        PessoaModel PessoaExistente = pessoaRepository.findById(id).orElseThrow(() -> new RuntimeException(id +" não existe"));
        PessoaExistente.setNome(pessoaRequest.getNome());
        PessoaExistente.setDataNascimento(pessoaRequest.getDataNascimento());
        pessoaRepository.save(PessoaExistente);
    }
}
