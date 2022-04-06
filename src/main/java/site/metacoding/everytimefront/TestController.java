package site.metacoding.everytimefront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String main() {
        return "layout/header";
    }
}
