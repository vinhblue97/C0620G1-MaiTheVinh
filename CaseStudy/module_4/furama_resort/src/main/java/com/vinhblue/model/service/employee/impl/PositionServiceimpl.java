package com.vinhblue.model.service.employee.impl;

import com.vinhblue.model.entity.employee.Position;
import com.vinhblue.model.repository.employee.PositionRepository;
import com.vinhblue.model.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceimpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return this.positionRepository.findAll();
    }
}
