package com.corematrix.repo;

import com.corematrix.entity.patientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patientRepo extends  JpaRepository<patientEntity, Long> {
}
