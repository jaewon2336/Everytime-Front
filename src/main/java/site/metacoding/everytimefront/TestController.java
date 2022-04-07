package site.metacoding.everytimefront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String main() {
        return "layout/header";
    }

    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping("/board")
    public String test() {
        return "board/clubBoard";
    }

    @GetMapping("/forgot")
    public String findUsername() {
        return "user/findUsernameForm";
    }
}
