package com.example.demo.Investimento;

import com.example.demo.DTO.InvestimentoDTO;
import com.example.demo.DTO.SimulacaoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/investimento")
public class ControllerInvestimento {

    @Autowired
   private ServiceInvestimento service;

    @PutMapping
    @ResponseStatus (HttpStatus.CREATED)
    public SimulacaoDTO cadastrarInvestimento (@RequestBody InvestimentoDTO investimentoACadastrar){
        return service.cadastrarInvestimento(investimentoACadastrar);
    }



}
