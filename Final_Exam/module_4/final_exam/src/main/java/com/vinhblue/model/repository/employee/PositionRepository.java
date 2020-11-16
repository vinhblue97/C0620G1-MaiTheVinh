package com.vinhblue.model.repository.employee;

import com.vinhblue.model.entity.employee.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<TypeProduct, Integer> {
}
