package controller;

import model.Ccstudent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.ICcstudentService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CcstudentController {

    @Resource
    private ICcstudentService service;

    public ICcstudentService getService() {
        return service;
    }

    public void setService(ICcstudentService service) {
        this.service = service;
    }

    /**
     * 学生登陆
     * @param ccstudent
     * @param request
     * @return
     */
    @RequestMapping("/stulogin.form")
    String login(Ccstudent ccstudent, HttpServletRequest request) {
        if (service.login(ccstudent)){
            request.setAttribute("stu",ccstudent);
            return "/queryCourse.form";
        }
        else
            return "/login.jsp";
    }


    /**
     * 学生选课
     * @param ccstudent
     * @return
     */
    @RequestMapping("/addcourse.form")
    @ResponseBody
    String add(Ccstudent ccstudent) {
        service.add(ccstudent);
        return "choose success";
    }

    /**
     * 登出操作
     * @param session
     * @return
     */
    @RequestMapping("/logout.form")
    public String getProduct(HttpSession session) {
        session.removeAttribute("stuid");
        session.removeAttribute("teachid");
        session.removeAttribute("stuname");
        return "/login.jsp";
    }
}
