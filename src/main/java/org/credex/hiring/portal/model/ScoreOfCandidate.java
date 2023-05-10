package org.credex.hiring.portal.model;
import javax.persistence.*;
@Entity
@Table(name = "student_scorecard")
public class ScoreOfCandidate {
    public ScoreOfCandidate() {
        super();
    }
    public int getScoreId() {
        return scoreId;
    }
    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="score_id")
    private int scoreId;
    @Column(name="scorecard")
    private int scorecard;
    @Column(name="feedback")
    private String feedback;
    @Column(name="technical_score1")
    private int technical_score1;
    @Column(name="technical_score2")
    private int technical_score2;
    public int getUserId2() {
        return userId2;
    }
    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }
    @Column(name="user_Id2")
    private int userId2;
    public ScoreOfCandidate(int scoreId, int technical_score1, int technical_score2, String feedback, int scorecard, int userId2) {
        this.scoreId = scoreId;
        this.technical_score1 = technical_score1;
        this.technical_score2 = technical_score2;
        this.feedback = feedback;
        this.scorecard = scorecard;
        this.userId2 = userId2;
    }
    public int getTechnical_score1() {
        return technical_score1;
    }
    public void setTechnical_score1(int technical_score1) {
        this.technical_score1 = technical_score1;
    }
    public int getTechnical_score2() {
        return technical_score2;
    }
    public void setTechnical_score2(int technical_score2) {
        this.technical_score2 = technical_score2;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public int getScorecard() {
        return scorecard;
    }
    public void setScorecard(int scorecard) {
        this.scorecard = scorecard;
    }
}

