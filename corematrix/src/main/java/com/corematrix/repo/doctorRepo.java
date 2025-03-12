package com.corematrix.repo;

import com.corematrix.entity.doctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctorRepo extends JpaRepository<doctorEntity,Long> {
}
