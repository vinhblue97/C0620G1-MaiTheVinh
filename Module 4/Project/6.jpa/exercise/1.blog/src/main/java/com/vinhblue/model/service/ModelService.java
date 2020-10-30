package com.vinhblue.model.service;



import com.vinhblue.model.entity.ModelManager;

import java.util.List;

public interface ModelService {
    List<ModelManager> findAll();

    void save(ModelManager modelManager);
}
