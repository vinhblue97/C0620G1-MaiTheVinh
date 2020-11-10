package com.vinhblue.model.repository.employee;

import com.vinhblue.model.entity.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepository extends JpaRepository<EducationDegree, Integer> {
}
