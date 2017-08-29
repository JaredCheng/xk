package service;

import dao.CcscoreMapper;
import model.Ccscore;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class CcscoreService implements IccscoreService {
    @Resource
    private CcscoreMapper ccscoreMapper;
    @Override
    public List<Ccscore> queryStudent(BigDecimal couid) {
        List<Ccscore> ccscores=ccscoreMapper.queryStudent(couid);
        return ccscores;
    }

    @Override
    public void updateScores(List<Ccscore> ccscores) {
        ccscoreMapper.update(ccscores);
    }
}
