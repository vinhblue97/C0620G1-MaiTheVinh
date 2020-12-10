package com.vinhblue.model.service;

import com.vinhblue.model.entity.Landing;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LandingService {
    Page<Landing> findAll(Pageable pageable);

    void save (Landing landing);
}
