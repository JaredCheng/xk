package dao;

import java.math.BigDecimal;
import java.util.List;

import model.Cccourse;

public interface CccourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CCCOURSE
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal couid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CCCOURSE
     *
     * @mbggenerated
     */
    int insert(Cccourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CCCOURSE
     *
     * @mbggenerated
     */
    int insertSelective(Cccourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CCCOURSE
     *
     * @mbggenerated
     */
    Cccourse selectByPrimaryKey(BigDecimal couid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CCCOURSE
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Cccourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CCCOURSE
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Cccourse record);

    /**
     * 查询所有课程
     * @return
     */
    List<Cccourse> query();

    /**
     * 根据老师编号查询老师所教课程
     * @param teachid
     * @return
     */
    List<Cccourse> teachquery(BigDecimal teachid);
}