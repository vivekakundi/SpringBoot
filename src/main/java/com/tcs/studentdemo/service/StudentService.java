package com.tcs.studentdemo.service;

import com.tcs.studentdemo.model.StudentDetails;
import com.tcs.studentdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;


    /* To store Student Details*/
    public void saveStudentDetails(StudentDetails studentDetails){
        studentRepository.save(studentDetails);
    }
    /* To store All Student Details*/
    public void saveAllStudentDetails(List<StudentDetails> studentDetailsList){
        studentRepository.saveAll(studentDetailsList);
    }
    /* To get Student Details By student Details*/
    public Optional<StudentDetails> getStudentDetails(int id){
        return studentRepository.findById(id);
    }
    /* To get All Student Details */
    public List<StudentDetails> getAllStudentDetails(){
        return studentRepository.findAll();
    }
    /* To Delete StudentDetails By Id*/
    public void deleteStudentDetailsById(int id){
        studentRepository.deleteById(id);
    }
    /* To DeleteAll StudentDetails */
    public void deleteAllStudentDetails(){
        studentRepository.deleteAll();
    }




}
