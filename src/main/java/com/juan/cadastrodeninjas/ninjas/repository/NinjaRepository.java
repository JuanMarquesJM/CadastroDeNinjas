package com.juan.cadastrodeninjas.ninjas.repository;

import com.juan.cadastrodeninjas.ninjas.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
