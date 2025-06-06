package com.Ranit.data.controller;

import com.Ranit.data.model.SchoolData;
import com.Ranit.data.repository.SchoolDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/school")
public class SchoolDataController {
      
      
      @Autowired
      private SchoolDataRepo schoolDataRepo;
      
      @PostMapping(path="/addNewSchool") // Map ONLY POST Requests
      public SchoolData addNewSchool(@RequestBody String schoolName) {
            
            SchoolData schoolData = new SchoolData();
            schoolData.setSchoolName(schoolName);
            schoolDataRepo.save(schoolData);
            
            return schoolData;
      }
}