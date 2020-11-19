package com.vinhblue.model.repository;

import com.vinhblue.model.entity.CityManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<CityManagement, Integer> {
}
