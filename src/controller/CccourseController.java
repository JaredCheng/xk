package controller;

import model.Ccstudent;
import model.Ccteacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IcccourseService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CccourseController {
    @Resource
    private IcccourseService icccourseService;

    public IcccourseService getIcccourseService() {
        return icccourseService;
    }

    public void setIcccourseService(IcccourseService icccourseService) {
        this.icccourseService = icccourseService;
    }

    /**
     * 查询可选课程
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("/queryCourse.form")
    public String queryCourse(HttpServletRequest request, HttpSession session) {
        Ccstudent stu= (Ccstudent) request.getAttribute("stu");
        session.setAttribute("stuid",stu.getStuid());
        request.setAttribute("courses", icccourseService.query());

        Sys'1111111111111111111111111111'

        return "/stu.jsp";
    }

    /**
     * 查询老师所教课程
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("/queryTeacherCourse.form")
    public String queryTeacherCourse(HttpServletRequest request, HttpSession session) {
        Ccteacher tea= (Ccteacher) request.getAttribute("tea");
        session.setAttribute("teachid",tea.getTeachid());
        request.setAttribute("courses", icccourseService.teachquery(tea.getTeachid()));
        return "/tea.jsp";
    }
}
