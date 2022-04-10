package site.metacoding.everytimefront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String home() {
        return "post/main";
    }

    @GetMapping("/test")
    public String test() {
        return "post/test";
    }
}
