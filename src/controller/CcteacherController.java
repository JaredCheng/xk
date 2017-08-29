package controller;

import model.Ccteacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.IccteacherService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CcteacherController {
    @Resource
    private IccteacherService service;

    public IccteacherService getService() {
        return service;
    }

    public void setService(IccteacherService service) {
        this.service = service;
    }

    /**
     * 老师登陆跳转到查询所教课程页面
     * @param ccteacher
     * @param request
     * @return
     */
    @RequestMapping("/tealogin.form")
    String login(Ccteacher ccteacher, HttpServletRequest request) {
        if(service.login(ccteacher)){
            request.setAttribute("tea",ccteacher);
            return "/queryTeacherCourse.form";
        }
        return "/login.jsp";
    }
}
