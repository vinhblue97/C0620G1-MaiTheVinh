package com.vinhblue.model.repository;

import com.vinhblue.model.entity.BorrowerManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowerRepository extends JpaRepository<BorrowerManagement, Integer> {
}
