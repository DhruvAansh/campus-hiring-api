package org.credex.hiring.portal.controller;
import com.pusher.rest.Pusher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private Pusher pusher;


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public ResponseEntity<?> sendMessage(@RequestParam("emailId") String emailId, @RequestParam("message") String message) {
        Map<String, String> eventData = new HashMap<>();
        eventData.put("emailId", emailId);
        eventData.put("message", message);
        pusher.trigger("my-channel", "my-event", eventData);
        return ResponseEntity.ok().build();
    }
}


