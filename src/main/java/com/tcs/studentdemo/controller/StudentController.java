package com.tcs.studentdemo.controller;

import com.tcs.studentdemo.model.StudentDetails;
import com.tcs.studentdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/storeStudentDetails",method = RequestMethod.POST)
    public String storeStudentDetails(@RequestBody StudentDetails studentDetails){
        studentService.saveStudentDetails(studentDetails);
        return "Student Details stored Successfully";
    }
    @RequestMapping(value = "/storeAllStudentDetails",method =RequestMethod.POST)
    public String storeAllStudentDetails(@RequestBody List<StudentDetails> studentDetails){
        studentService.saveAllStudentDetails(studentDetails);
        return "All Student Details stored Successfully";
    }

    @RequestMapping(value = "/deleteStudentDetails",method = RequestMethod.DELETE)
    public void deleteStudentDetails(int id){
        studentService.deleteStudentDetailsById(id);
    }
    @RequestMapping(value = "/deleteAllStudentDetails",method = RequestMethod.DELETE)
    public void deleteAllStudentDetails(){
        studentService.deleteAllStudentDetails();
    }
    @RequestMapping(value ="/getStudentDetails/{id}",method = RequestMethod.GET)
    public Optional<StudentDetails> getStudentDetails(@PathVariable int id){
        return studentService.getStudentDetails(id);
    }
    @RequestMapping(value = "/getAllStudentDetails",method = RequestMethod.GET)
    public List<StudentDetails> getAllStudentDetails(){
        return studentService.getAllStudentDetails();
    }




}
