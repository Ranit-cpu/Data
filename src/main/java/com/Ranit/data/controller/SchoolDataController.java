package com.Ranit.data.controller;

import com.Ranit.data.dto.SchoolDataDTO;
import com.Ranit.data.model.SchoolData;
import com.Ranit.data.repository.SchoolDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/school")
public class SchoolDataController {
      
      @Autowired
      private SchoolDataRepo schoolDataRepo;
      
      @PostMapping(path="/addNewSchool", consumes = "application/json") // Map ONLY POST Requests
      public @ResponseBody SchoolData addNewSchool(@RequestBody SchoolDataDTO schoolName) {
            
            SchoolData schoolData = new SchoolData();
            schoolData.setSchoolName(schoolName.getSchoolName());
            schoolDataRepo.save(schoolData);
            
            return schoolDataRepo.save(schoolData);
      }
      
      @GetMapping(path = "/allschools")                     // Returns all School data
      public @ResponseBody List<SchoolData> getAllschool(){
            return schoolDataRepo.findAll();
      }
}