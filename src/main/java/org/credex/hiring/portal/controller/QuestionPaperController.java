//package org.credex.hiring.portal.controller;
//
//import org.codehaus.jackson.annotate.JsonValue;
//import org.credex.hiring.portal.service.QuestionPaperService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class QuestionPaperController {
//    @Autowired
//    private QuestionPaperService questionPaperService;
//
//    @PostMapping("/questionpaper/upload")
//    public ResponseEntity<String> uploadQuestionPaper( @RequestBody String fileContent) {
//        ResponseEntity<String> response = questionPaperService.uploadFile(fileContent);
//        return response;
//    }
//}
//
