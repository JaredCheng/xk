package service;

import model.Ccscore;

import java.math.BigDecimal;
import java.util.List;

public interface IccscoreService {
    List<Ccscore> queryStudent(BigDecimal couid);
    void updateScores(List<Ccscore> ccscores);
}
