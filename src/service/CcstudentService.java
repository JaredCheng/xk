package service;

import dao.CcscoreMapper;
import dao.CcstudentMapper;
import model.Ccstudent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class CcstudentService implements ICcstudentService {
    @Resource
    private CcstudentMapper ccstudentMapper;
    @Resource
    private CcscoreMapper ccscoreMapper;

    @Transactional(propagation = Propagation.REQUIRED)

    public CcstudentMapper getCcstudentMapper() {
        return ccstudentMapper;
    }

    public void setCcstudentMapper(CcstudentMapper ccstudentMapper) {
        this.ccstudentMapper = ccstudentMapper;
    }

    public CcscoreMapper getCcscoreMapper() {
        return ccscoreMapper;
    }

    public void setCcscoreMapper(CcscoreMapper ccscoreMapper) {
        this.ccscoreMapper = ccscoreMapper;
    }

    /**
     * 将所选的志愿插入ccscore表
     *
     * @param ccstudent
     * @return
     */
    @Override
    public int add(Ccstudent ccstudent) {
        int j = ccscoreMapper.add(ccstudent.getCcscores());
        return j;
    }
    /**
     * 学生登陆验证
     *
     * @param ccstudent
     * @return
     */
    @Override
    public boolean login(Ccstudent ccstudent) {
        if (ccstudentMapper.login(ccstudent) != null)
            return true;
        return false;
    }

}
