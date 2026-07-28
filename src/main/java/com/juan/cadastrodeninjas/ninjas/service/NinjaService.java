package com.juan.cadastrodeninjas.ninjas.service;

import com.juan.cadastrodeninjas.ninjas.model.NinjaModel;
import com.juan.cadastrodeninjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Lista todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

}
