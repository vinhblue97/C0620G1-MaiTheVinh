package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.ModelManager;
import com.vinhblue.model.repository.ModelRepository;
import com.vinhblue.model.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {
    @Autowired
    private ModelRepository modelRepository;

    @Override
    public List<ModelManager> findAll() {
        return this.modelRepository.findAll();
    }

    @Override
    public void save(ModelManager modelManager) {
        this.modelRepository.save(modelManager);
    }

    @Override
    public Page<ModelManager> findAll(Pageable pageable) {
        return this.modelRepository.findAll(pageable);
    }

    @Override
    public Page<ModelManager> findByNameContaining(Pageable pageable, String name) {
        return this.modelRepository.findByModelNameContaining(pageable, name);
    }

    @Override
    public ModelManager findById(Integer id) {
        return this.modelRepository.findById(id).orElse(null);
    }
}
