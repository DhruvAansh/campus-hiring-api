package org.credex.hiring.portal.controller;

import org.credex.hiring.portal.dao.CampusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/chart")
public class ChartController {
    @Autowired
    private CampusDao campusDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/counts")
    public Map<String, Long> getCounts(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        return campusDao.getCounts();
    }
}
