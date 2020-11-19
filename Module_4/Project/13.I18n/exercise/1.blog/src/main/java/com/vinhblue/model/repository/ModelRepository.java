package com.vinhblue.model.repository;

import com.vinhblue.model.entity.ModelManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<ModelManager, Integer> {
    Page<ModelManager> findByModelNameContaining(Pageable pageable, String name);
}
