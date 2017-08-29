package service;

import dao.CccourseMapper;
import dao.CcteacherMapper;
import model.Ccteacher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class CcteacherService implements IccteacherService {
    @Resource
    private CcteacherMapper ccteacherMapper;
    @Resource
    private CccourseMapper cccourseMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public CcteacherMapper getCcteacherMapper() {
        return ccteacherMapper;
    }

    public void setCcteacherMapper(CcteacherMapper ccteacherMapper) {
        this.ccteacherMapper = ccteacherMapper;
    }

    public CccourseMapper getCccourseMapper() {
        return cccourseMapper;
    }

    public void setCccourseMapper(CccourseMapper cccourseMapper) {
        this.cccourseMapper = cccourseMapper;
    }

    /**
     * 验证老师登陆
     *
     * @param ccteacher
     * @return
     */
    @Override
    public boolean login(Ccteacher ccteacher) {
        if (ccteacherMapper.login(ccteacher) != null)
            return true;
        return false;
    }
}
