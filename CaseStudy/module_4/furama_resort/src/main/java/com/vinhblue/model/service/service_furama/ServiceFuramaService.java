package com.vinhblue.model.service.service_furama;

import com.vinhblue.model.entity.service_furama.ServiceFurama;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceFuramaService {
    void save(ServiceFurama serviceFurama);

    Page<ServiceFurama> findAll(Pageable pageable);

    ServiceFurama findById(String id);

    List<ServiceFurama> findAll();

    void delete(ServiceFurama serviceFurama);
}
