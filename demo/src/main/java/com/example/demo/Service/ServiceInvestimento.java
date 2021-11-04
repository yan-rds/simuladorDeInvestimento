package com.example.demo.Service;


import com.example.demo.DTO.InvestimentoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ServiceInvestimento {

    private List <InvestimentoDTO> investidores = new ArrayList<>();

    public void cadastrarInvestimento (InvestimentoDTO investimentoACadastrar){
        investidores.add(investimentoACadastrar);
    }


}
