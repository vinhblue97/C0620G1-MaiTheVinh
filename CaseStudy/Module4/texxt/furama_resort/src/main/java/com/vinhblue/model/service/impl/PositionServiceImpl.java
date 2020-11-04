package com.furama_resort.model.service.impl;

import com.furama_resort.model.entity.employee.Position;
import com.furama_resort.model.repository.PositionRepository;
import com.furama_resort.model.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return this.positionRepository.findAll();
    }
}
