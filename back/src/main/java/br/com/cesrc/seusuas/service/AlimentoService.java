package br.com.cesrc.seusuas.service;

import br.com.cesrc.seusuas.model.alimento.AlimentoModel;
import br.com.cesrc.seusuas.model.alimento.TipoAlimento;
import br.com.cesrc.seusuas.repository.AlimentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentoService {

    private final AlimentoRepository alimentoRepository;

    public AlimentoService(AlimentoRepository alimentoRepository) {
        this.alimentoRepository = alimentoRepository;
    }

    public AlimentoModel salvarAlimento(AlimentoModel alimento) {
        return alimentoRepository.save(alimento);
    }

    public void deletarAlimento(Long id) {
        alimentoRepository.deleteById(id);
    }

    public List<AlimentoModel> listarAlimento() {
        return alimentoRepository.findAll();
    }

    public List<AlimentoModel> listarAlimentoPorNome(String nome) {
        return alimentoRepository.findByNomeContaining(nome);
    }

    public List<AlimentoModel> listarAlimentosPorVitaminaADesc() {
        return alimentoRepository.findAllOrderByVitaminaADesc();
    }

    public List<AlimentoModel> listarAlimentosPorVitaminaBDesc() {
        return alimentoRepository.findAllOrderByVitaminaBDesc();
    }

    public List<AlimentoModel> listarAlimentosPorVitaminaCDesc() {
        return alimentoRepository.findAllOrderByVitaminaCDesc();
    }

    public List<AlimentoModel> listarAlimentosPorVitaminaDDesc() {
        return alimentoRepository.findAllOrderByVitaminaDDesc();
    }

    public List<AlimentoModel> listarAlimentosPorVitaminaEDesc() {
        return alimentoRepository.findAllOrderByVitaminaEDesc();
    }

    public List<AlimentoModel> listarAlimentosPorVitaminaKDesc() {
        return alimentoRepository.findAllOrderByVitaminaKDesc();
    }

    public List<AlimentoModel> listarAlimentosPorTipo(TipoAlimento tipoAlimento) {
        return alimentoRepository.findByTipo(tipoAlimento);
    }

    public List<AlimentoModel> listarAlimentosPorProteinasDesc() {
        return alimentoRepository.findAllOrderByProteinasDesc();
    }
}
