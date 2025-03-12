package com.corematrix.controller;

import com.corematrix.entity.patientEntity;
import com.corematrix.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class patientController {

    @Autowired
    private patientService patientService;

    @GetMapping("/get")
    public List<patientEntity> getpatientDetails(){
        return patientService.patientDetails();
    }

    @PostMapping("/save")
    public patientEntity saveDetails(@RequestBody patientEntity patientEntity){
        return patientService.savePatientDetails(patientEntity);
    }


}
