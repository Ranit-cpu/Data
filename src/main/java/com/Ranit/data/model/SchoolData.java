package com.Ranit.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SchoolData {

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Integer id;
      
      private String schoolName;
      
      public Integer getId() {
            return id;
      }
      
      public void setId(Integer id) {
            this.id = id;
      }
      
      public String getSchoolName() {
            return schoolName;
      }
      
      public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
      }
}