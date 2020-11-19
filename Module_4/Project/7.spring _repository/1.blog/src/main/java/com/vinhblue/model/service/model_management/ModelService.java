package com.vinhblue.model.service.model_management;



import com.vinhblue.model.entity.ModelManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ModelService {
    List<ModelManager> findAll();

    void save(ModelManager modelManager);

    Page<ModelManager> findAll(Pageable pageable);

    Page<ModelManager> findByNameContaining(Pageable pageable, String name);
}