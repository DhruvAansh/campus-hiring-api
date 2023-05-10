package org.credex.hiring.portal.controller;

import org.credex.hiring.portal.dao.CollegeDao;
import org.credex.hiring.portal.dao.UserDao;
import org.credex.hiring.portal.model.Colleges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colleges")
public class CollegeController {
    @Autowired
    private CollegeDao collegeDao;
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public Colleges createUser(@Validated @RequestBody Colleges colleges) {
        return collegeDao.createCollege(colleges);

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public List<Colleges> getAllCollege() {
        return collegeDao.getAllCollege();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public Colleges updateCollege(@RequestBody Colleges colleges) {
        return collegeDao.updateCollege(colleges);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete/{collegeId}")
    public String deleteCollege(@PathVariable("collegeId") int collegeId) {
        return collegeDao.deleteCollege(collegeId);
    }
}
