package com.juan.cadastrodeninjas.missoes.repository;

import com.juan.cadastrodeninjas.missoes.model.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRespository extends JpaRepository<MissoesModel, Long> {
}
