package com.juan.cadastrodeninjas.ninjas.dto;

import com.juan.cadastrodeninjas.missoes.model.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private String imgUrl;
    private Integer idade;
    private String ranking;
    private MissoesModel missoes;
}
