package com.vinhblue.model.repository.service_furama;

import com.vinhblue.model.entity.service_furama.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTypeRepository extends JpaRepository<ServiceType, Integer> {
}
