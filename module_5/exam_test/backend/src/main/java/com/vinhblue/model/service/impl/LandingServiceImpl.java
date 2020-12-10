package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.Landing;
import com.vinhblue.model.repository.LandingRepository;
import com.vinhblue.model.service.LandingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LandingServiceImpl implements LandingService {

    @Autowired
    private LandingRepository landingRepository;
    @Override
    public Page<Landing> findAll(Pageable pageable) {
        return this.landingRepository.findAll(pageable);
    }

    @Override
    public void save(Landing landing) {
        this.landingRepository.save(landing);
    }
}
