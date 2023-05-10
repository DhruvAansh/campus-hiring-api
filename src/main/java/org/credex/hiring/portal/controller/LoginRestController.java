package org.credex.hiring.portal.controller;

import org.credex.hiring.portal.model.LoggedInUser;
import org.credex.hiring.portal.model.LoginInfo;
import org.credex.hiring.portal.service.LoginAndRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credex")
public class LoginRestController {

    private LoginAndRegistration loginAndRegistration;

    @Autowired(required = true)
    public void setLoginAndRegistration(LoginAndRegistration loginAndRegistration) {
        this.loginAndRegistration = loginAndRegistration;
    }

    @GetMapping("/")
    protected String welcome () {
        return "you are on login controller";
    }

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    protected ResponseEntity<Object> login (@RequestBody LoginInfo loginInfo) {
        if (loginAndRegistration.validateUser(loginInfo)) {
            LoggedInUser user = new LoggedInUser();
            user.setUseName("Gourav");
            user.setRole("Admin");
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.badRequest().body("Invalid creds!!");
    }
}
