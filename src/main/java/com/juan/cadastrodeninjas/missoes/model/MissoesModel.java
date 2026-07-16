package com.juan.cadastrodeninjas.missoes.model;


import com.juan.cadastrodeninjas.ninjas.model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    // @OneToMany - Uma missão pode ter vários ninjas
    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}

