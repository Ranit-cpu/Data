package com.Ranit.data.repository;

import com.Ranit.data.model.SchoolData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDataRepo extends JpaRepository<SchoolData,Integer> {
}
