package com.tcs.studentdemo.repository;

import com.tcs.studentdemo.model.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDetails,Integer> {
}
