package service;

import model.Cccourse;

import java.math.BigDecimal;
import java.util.List;

public interface IcccourseService {
    List<Cccourse> query();

    List<Cccourse> teachquery(BigDecimal teachid);
}
