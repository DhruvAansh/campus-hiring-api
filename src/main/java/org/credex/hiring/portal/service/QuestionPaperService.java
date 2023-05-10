//package org.credex.hiring.portal.service;
//
//import Drive.Upload.GoogleDriveService;
//import org.credex.hiring.portal.dao.QuestionPaperDao;
//import org.credex.hiring.portal.model.QuestionPaper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//@Service
//public class QuestionPaperService {
//    @Autowired
//    private GoogleDriveService googleDriveService;
//    @Autowired
//    private QuestionPaperDao questionPaperDao;
//
//    public ResponseEntity<String> uploadFile(String fileContent) {
//        try {
//            // Upload the file to Google Drive and get the drive link
//            String driveLink = null;
//
//            // Save the generated link in the database
//            QuestionPaper questionPaper = new QuestionPaper();
//            questionPaper.setQuestionPaper(fileContent);
//            questionPaper.setPaperLink(driveLink);
//            questionPaperDao.saveQuestionPaper(questionPaper);
//
//            // Return the drive link in the response
//            return ResponseEntity.ok(driveLink);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//}
