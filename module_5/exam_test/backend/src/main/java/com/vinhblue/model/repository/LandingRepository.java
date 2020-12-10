package com.vinhblue.model.repository;

import com.vinhblue.model.entity.Landing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandingRepository extends JpaRepository<Landing, Integer> {
}
