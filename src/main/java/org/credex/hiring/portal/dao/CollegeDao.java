package org.credex.hiring.portal.dao;

import org.credex.hiring.portal.model.Colleges;
import org.credex.hiring.portal.model.Users;

import java.util.List;

public interface CollegeDao {
    Colleges createCollege(Colleges colleges);
    Colleges updateCollege(Colleges colleges);
    String deleteCollege(int collegeId);
    List<Colleges> getAllCollege();
}
