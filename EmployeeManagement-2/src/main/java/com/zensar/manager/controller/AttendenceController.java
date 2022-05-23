package com.zensar.manager.controller;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.manager.model.Attendence;
import com.zensar.manager.service.AttendenceService;











@RestController
@RequestMapping("/api/vi")
public class AttendenceController {
@Autowired
private AttendenceService service;




@PostMapping("/attendence")
public Attendence attendanceService(@RequestBody Attendence attend)
{
return service.saveAttendance(attend);
}



@GetMapping("/attendence")
public List<Attendence> getAllAttendence(){
return service.getAllAttendance();
}





}