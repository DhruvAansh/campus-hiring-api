package org.credex.hiring.portal.dao;
import org.credex.hiring.portal.model.ScoreOfCandidate;
import java.util.List;
public interface ScoreOfCandidateDao {
    ScoreOfCandidate getScorecardById(int userId2);
    ScoreOfCandidate createScorecard(ScoreOfCandidate scoreOfCandidate);
    List<ScoreOfCandidate> getAllScorecard();

}





