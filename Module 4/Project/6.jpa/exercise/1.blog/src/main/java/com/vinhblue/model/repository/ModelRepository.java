package com.vinhblue.model.repository;

import com.vinhblue.model.entity.ModelManager;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ModelRepository extends JpaRepository<ModelManager,Integer> {
}
