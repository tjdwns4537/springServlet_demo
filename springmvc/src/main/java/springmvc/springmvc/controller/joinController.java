package springmvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/join")
public class joinController {

    @PostMapping("/login")
    public String login(
            @RequestParam String id,
            @RequestParam String pw
                        ) {
        return "/login";
    }
}
