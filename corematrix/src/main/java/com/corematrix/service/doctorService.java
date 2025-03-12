package com.corematrix.service;

import com.corematrix.entity.doctorEntity;
import com.corematrix.entity.patientEntity;
import com.corematrix.repo.doctorRepo;
import com.corematrix.repo.patientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class doctorService {

    @Autowired
    private doctorRepo doctorRepo;

    public List<doctorEntity> doctorDetails(){
        return doctorRepo.findAll();
    }

    public doctorEntity saveDoctorDetails(@RequestBody doctorEntity doctorEntity){
        return doctorRepo.save(doctorEntity);
    }
}
