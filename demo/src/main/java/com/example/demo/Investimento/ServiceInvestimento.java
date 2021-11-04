package com.example.demo.Investimento;


import com.example.demo.DTO.InvestimentoDTO;
import com.example.demo.DTO.SimulacaoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;


@Service
public class ServiceInvestimento {

    private List <InvestimentoDTO> investidores = new ArrayList<>();
    private List <SimulacaoDTO> simulacoes = new ArrayList<>();

    public SimulacaoDTO cadastrarInvestimento (InvestimentoDTO investimentoACadastrar){
        investidores.add(investimentoACadastrar);
        return calcularInvestimento(investimentoACadastrar);
    }


    public SimulacaoDTO calcularInvestimento(InvestimentoDTO investimentoDTO){

        double valorTotalAtual = investimentoDTO.getValorInvestido();
        double lucroAtual = 0;
        int mesesInvestidos = investimentoDTO.getPeriodoDeAplicacaoMeses();

        UnaryOperator <Double> lucroMensal = x -> x * investimentoDTO.getRisco().getTaxaDeRetorno();

        for (int i = mesesInvestidos; i > 0; i--){
            lucroAtual = lucroAtual + lucroMensal.apply(valorTotalAtual);
            valorTotalAtual = valorTotalAtual + lucroAtual;

        }
        double montante = investimentoDTO.getValorInvestido() + lucroAtual;


        SimulacaoDTO simulacaoDTO = new SimulacaoDTO(investimentoDTO.getValorInvestido(), lucroAtual, montante);
        simulacoes.add(simulacaoDTO);
        return simulacaoDTO;

    }


}
