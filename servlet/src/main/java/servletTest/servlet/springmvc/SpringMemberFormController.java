package servletTest.servlet.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringMemberFormController {

    @RequestMapping("/springmvc/")
    public ModelAndView proces() {
        return new ModelAndView("new-form");
    }
}
