package com.corematrix.service;

import com.corematrix.entity.patientEntity;
import com.corematrix.repo.patientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class patientService {

    @Autowired
    private patientRepo patientRepo;

    public List<patientEntity> patientDetails(){
        return patientRepo.findAll();
    }

    public patientEntity savePatientDetails(@RequestBody patientEntity patientEntity){
        return patientRepo.save(patientEntity);
    }
}
