package model;

import java.math.BigDecimal;
import java.util.List;

public class Ccteacher {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CCTEACHER.TEACHID
     *
     * @mbggenerated
     */
    private BigDecimal teachid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CCTEACHER.PASSWORD
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CCTEACHER.TEACHERNAME
     *
     * @mbggenerated
     */
    private String teachername;

    private List<Cccourse> cccourses;

    public List<Cccourse> getCccourses() {
        return cccourses;
    }

    public void setCccourses(List<Cccourse> cccourses) {
        this.cccourses = cccourses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CCTEACHER.TEACHID
     *
     * @return the value of CCTEACHER.TEACHID
     * @mbggenerated
     */
    public BigDecimal getTeachid() {
        return teachid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CCTEACHER.TEACHID
     *
     * @param teachid the value for CCTEACHER.TEACHID
     * @mbggenerated
     */
    public void setTeachid(BigDecimal teachid) {
        this.teachid = teachid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CCTEACHER.PASSWORD
     *
     * @return the value of CCTEACHER.PASSWORD
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CCTEACHER.PASSWORD
     *
     * @param password the value for CCTEACHER.PASSWORD
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CCTEACHER.TEACHERNAME
     *
     * @return the value of CCTEACHER.TEACHERNAME
     * @mbggenerated
     */
    public String getTeachername() {
        return teachername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CCTEACHER.TEACHERNAME
     *
     * @param teachername the value for CCTEACHER.TEACHERNAME
     * @mbggenerated
     */
    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }
}