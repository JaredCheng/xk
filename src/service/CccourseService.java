package service;

import dao.CccourseMapper;
import model.Cccourse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class CccourseService implements IcccourseService {
    @Resource
    private CccourseMapper cccourseMapper;

    public CccourseMapper getCccourseMapper() {
        return cccourseMapper;
    }

    public void setCccourseMapper(CccourseMapper cccourseMapper) {
        this.cccourseMapper = cccourseMapper;
    }

    @Override
    public List<Cccourse> query() {
        List<Cccourse> courses = cccourseMapper.query();
        return courses;
    }

    @Override
    public List<Cccourse> teachquery(BigDecimal teachid) {
        List<Cccourse> courses = cccourseMapper.teachquery(teachid);
        return courses;
    }
}
