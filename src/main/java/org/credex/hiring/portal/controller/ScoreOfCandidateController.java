package org.credex.hiring.portal.controller;
import org.credex.hiring.portal.dao.ScoreOfCandidateDao;
import org.credex.hiring.portal.model.Role;
import org.credex.hiring.portal.model.ScoreOfCandidate;
import org.credex.hiring.portal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/score")
public class ScoreOfCandidateController {
    @Autowired
    private ScoreOfCandidateDao scoreOfCandidateDao;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getById/{userId2}")
    public ScoreOfCandidate getScorecardById(@PathVariable int userId2) {
        return scoreOfCandidateDao.getScorecardById(userId2);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/get")
    public List<ScoreOfCandidate> getAllScorecard() {
        return scoreOfCandidateDao.getAllScorecard();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value="/create")
    public ScoreOfCandidate createScorecard(@RequestBody ScoreOfCandidate scoreOfCandidate) {
        return scoreOfCandidateDao.createScorecard(scoreOfCandidate);
    }

}





