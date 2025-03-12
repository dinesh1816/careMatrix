package com.corematrix.controller;

import com.corematrix.entity.doctorEntity;
import com.corematrix.entity.patientEntity;
import com.corematrix.service.doctorService;
import com.corematrix.service.patientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/doctor")
public class doctorController {

    @Autowired
    private doctorService doctorService;

    @GetMapping("/get")
    public List<doctorEntity> getDoctorDetails(){
        return doctorService.doctorDetails();
    }

    @PostMapping("/save")
    public doctorEntity saveDetails(@RequestBody doctorEntity doctorEntity){
        return doctorService.saveDoctorDetails(doctorEntity);
    }

}
