package org.credex.hiring.portal.controller;

import com.google.logging.type.HttpRequest;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.codehaus.jackson.annotate.JsonValue;
import org.codehaus.jackson.map.annotate.JsonView;
import org.credex.hiring.portal.dao.UserDao;
import org.credex.hiring.portal.model.Login;
import org.credex.hiring.portal.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private UserDao userDao;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/login")
    public Login authenticateUser(@RequestBody Login login) {

          return userDao.authenticateUser(login.getEmailId(), login.getPass());

    }


}

