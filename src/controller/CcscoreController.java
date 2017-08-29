package controller;
import model.Ccscore;
import model.Ccstudent;
import model.Ccteacher;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.IccscoreService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.List;

@Controller
public class CcscoreController {
    @Resource
    private IccscoreService service;

    public IccscoreService getService() {
        return service;
    }

    public void setService(IccscoreService service) {
        this.service = service;
    }

    /**
     * 查询老师所教课程的所有学生及成绩
     * @param request
     * @param couid
     * @param session
     * @return
     */
    @RequestMapping("/querystudent.form")
    String queryStudent(HttpServletRequest request, String couid, HttpSession session){
        List<Ccscore> ccscores=service.queryStudent(new BigDecimal(couid));
        request.setAttribute("ccscores",ccscores);
        return "/stuscore.jsp";
    }

    /**
     * 更新分数
     * @param ccstudent
     * @return
     */
    @RequestMapping("/updateScore.form")
    @ResponseBody
    String updateScore(Ccstudent ccstudent){
       service.updateScores(ccstudent.getCcscores());
       return "update success";
    }
}
