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

    // Busca aproximada por nome
    public List<AlimentoModel> listarAlimentoPorNome(String nome) {
        return alimentoRepository.findByNomeContaining(nome);
    }

    // Busca aproximada por vitamina A
    public List<AlimentoModel> listarAlimentosPorVitaminaA(Double quantidade) {
        return alimentoRepository.findByVitaminaA(quantidade);
    }

    // Busca aproximada por vitamina B
    public List<AlimentoModel> listarAlimentosPorVitaminaB(Double quantidade) {
        return alimentoRepository.findByVitaminaB(quantidade);
    }

    // Busca aproximada por vitamina C
    public List<AlimentoModel> listarAlimentosPorVitaminaC(Double quantidade) {
        return alimentoRepository.findByVitaminaC(quantidade);
    }

    // Busca aproximada por vitamina D
    public List<AlimentoModel> listarAlimentosPorVitaminaD(Double quantidade) {
        return alimentoRepository.findByVitaminaD(quantidade);
    }

    // Busca aproximada por vitamina E
    public List<AlimentoModel> listarAlimentosPorVitaminaE(Double quantidade) {
        return alimentoRepository.findByVitaminaE(quantidade);
    }

    // Busca aproximada por vitamina K
    public List<AlimentoModel> listarAlimentosPorVitaminaK(Double quantidade) {
        return alimentoRepository.findByVitaminaK(quantidade);
    }

    public List<AlimentoModel> listarAlimentosPorTipo(TipoAlimento tipoAlimento) {
        return alimentoRepository.findByTipo(tipoAlimento);
    }

    // Ordenação por proteína
    public List<AlimentoModel> listarAlimentosPorProteinasDesc() {
        return alimentoRepository.findAllOrderByProteinasDesc();
    }

    // Ordenação por vitamina A (descendente)
    public List<AlimentoModel> listarAlimentosPorVitaminaADesc() {
        return alimentoRepository.findAllOrderByVitaminaADesc();
    }

    // Ordenação por vitamina B (descendente)
    public List<AlimentoModel> listarAlimentosPorVitaminaBDesc() {
        return alimentoRepository.findAllOrderByVitaminaBDesc();
    }

    // Ordenação por vitamina C (descendente)
    public List<AlimentoModel> listarAlimentosPorVitaminaCDesc() {
        return alimentoRepository.findAllOrderByVitaminaCDesc();
    }

    // Ordenação por vitamina D (descendente)
    public List<AlimentoModel> listarAlimentosPorVitaminaDDesc() {
        return alimentoRepository.findAllOrderByVitaminaDDesc();
    }

    // Ordenação por vitamina E (descendente)
    public List<AlimentoModel> listarAlimentosPorVitaminaEDesc() {
        return alimentoRepository.findAllOrderByVitaminaEDesc();
    }

    // Ordenação por vitamina K (descendente)
    public List<AlimentoModel> listarAlimentosPorVitaminaKDesc() {
        return alimentoRepository.findAllOrderByVitaminaKDesc();
    }

    // Ordenação por proteína (crescente)
    public List<AlimentoModel> listarAlimentosPorProteinasAsc() {
        return alimentoRepository.findAllOrderByProteinasAsc();
    }

    // Ordenação por vitamina A (crescente)
    public List<AlimentoModel> listarAlimentosPorVitaminaAAsc() {
        return alimentoRepository.findAllOrderByVitaminaAAsc();
    }

    // Ordenação por vitamina B (crescente)
    public List<AlimentoModel> listarAlimentosPorVitaminaBAsc() {
        return alimentoRepository.findAllOrderByVitaminaBAsc();
    }

    // Ordenação por vitamina C (crescente)
    public List<AlimentoModel> listarAlimentosPorVitaminaCAsc() {
        return alimentoRepository.findAllOrderByVitaminaCAsc();
    }

    // Ordenação por vitamina D (crescente)
    public List<AlimentoModel> listarAlimentosPorVitaminaDAsc() {
        return alimentoRepository.findAllOrderByVitaminaDAsc();
    }

    // Ordenação por vitamina E (crescente)
    public List<AlimentoModel> listarAlimentosPorVitaminaEAsc() {
        return alimentoRepository.findAllOrderByVitaminaEAsc();
    }

    // Ordenação por vitamina K (crescente)
    public List<AlimentoModel> listarAlimentosPorVitaminaKAsc() {
        return alimentoRepository.findAllOrderByVitaminaKAsc();
    }
    //Test
    public List<AlimentoModel> buscarAlimentosComVariacao(
    String nome,
    TipoAlimento tipoAlimento,
    Integer gramaMin,
    Integer gramaMax,
    Integer valorEnergeticoMin,
    Integer valorEnergeticoMax,
    Integer carboidratosMin,
    Integer carboidratosMax,
    Integer acucaresTotaisMin,
    Integer acucaresTotaisMax,
    Integer acucaresAdicionaisMin,
    Integer acucaresAdicionaisMax,
    Integer proteinasMin,
    Integer proteinasMax,
    Integer gorduraTotaisMin,
    Integer gorduraTotaisMax,
    Integer gorduraTransMin,
    Integer gorduraTransMax,
    Integer gorduraSaturadaMin,
    Integer gorduraSaturadaMax,
    Integer fibraMin,
    Integer fibraMax,
    Integer sodioMin,
    Integer sodioMax,
    Integer vitaminaAMin,
    Integer vitaminaAMax,
    Integer vitaminaBMin,
    Integer vitaminaBMax,
    Integer vitaminaCMin,
    Integer vitaminaCMax,
    Integer vitaminaDMin,
    Integer vitaminaDMax,
    Integer vitaminaEMin,
    Integer vitaminaEMax,
    Integer vitaminaKMin,
    Integer vitaminaKMax) {

        return alimentoRepository.findByAllFieldsWithVariation(
                nome, tipoAlimento, gramaMin, gramaMax, valorEnergeticoMin, valorEnergeticoMax,
                carboidratosMin, carboidratosMax, acucaresTotaisMin, acucaresTotaisMax,
                acucaresAdicionaisMin, acucaresAdicionaisMax, proteinasMin, proteinasMax,
                gorduraTotaisMin, gorduraTotaisMax, gorduraTransMin, gorduraTransMax,
                gorduraSaturadaMin, gorduraSaturadaMax, fibraMin, fibraMax,
                sodioMin, sodioMax, vitaminaAMin, vitaminaAMax, vitaminaBMin, vitaminaBMax,
                vitaminaCMin, vitaminaCMax, vitaminaDMin, vitaminaDMax,
                vitaminaEMin, vitaminaEMax, vitaminaKMin, vitaminaKMax
        );
    }
}
