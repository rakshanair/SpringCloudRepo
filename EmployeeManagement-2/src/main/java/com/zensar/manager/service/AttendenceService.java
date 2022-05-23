package com.zensar.manager.service;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.manager.model.Attendence;
import com.zensar.manager.repo.AttendenceRepo;













@Service
public class AttendenceService {
@Autowired
private AttendenceRepo repository;




public Attendence saveAttendance(Attendence attend)
{
return repository.save(attend);
}
public List<Attendence> getAllAttendance(){
return repository.findAll();
}





}