package com.vinhblue.model.repository.service_furama;

import com.vinhblue.model.entity.service_furama.ServiceFurama;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceFuramaRepository extends JpaRepository<ServiceFurama, Integer> {
    ServiceFurama findByServiceId(String id);
}
