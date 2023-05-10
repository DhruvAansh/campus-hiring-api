package org.credex.hiring.portal.controller;

import org.credex.hiring.portal.dao.DashBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Dashboard")
public class DashBoardController {

    @Autowired
    private DashBoard dashBoard;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getCollegeCount")
    public Long TotalCollegeCount() {
        return dashBoard.TotalCollegeCount();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/studentsEnrolled")
    public Long Students_Enrolled() {
        return dashBoard.Students_Enrolled();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/SelectedStudents")
    public Long Selected_Students() {
        return dashBoard.Selected_Students();
    }
}

