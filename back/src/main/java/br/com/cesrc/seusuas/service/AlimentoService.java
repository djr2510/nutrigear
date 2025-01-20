package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.pessoa.PessoaModel;
import br.com.cesrc.seusuas.repository.AlimentoRepository;
import br.com.cesrc.seusuas.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoService {

    private final AlimentoRepository alimentoRepository;
    public AlimentoService(AlimentoRepository alimentoRepository){this.alimentoRepository = alimentoRepository;}
    public AlimentoModel salvarAlimento (AlimentoModel alimento){return alimentoRepository.save(alimento);}
    public void deletarAlimento (Long id){
        alimentoRepository.deleteById(id);
    }
    public List<AlimentoModel> listarAlimento(){
        return alimentoRepository.findAll();
    }
    public List<AlimentoModel> ListarAlimentoPorNome(String nome){return alimentoRepository.findByNomeContaining(nome);}
}