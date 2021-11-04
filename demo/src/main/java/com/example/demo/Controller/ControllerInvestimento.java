package com.example.demo.Controller;

import com.example.demo.DTO.InvestimentoDTO;
import com.example.demo.Service.ServiceInvestimento;
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
    public void cadastrarInvestimento (@RequestBody InvestimentoDTO investimentoACadastrar){
        service.cadastrarInvestimento(investimentoACadastrar);
    }



}
