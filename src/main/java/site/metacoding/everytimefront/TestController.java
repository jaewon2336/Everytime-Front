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

    @GetMapping("/forgot/password")
    public String findPassword() {
        return "user/findPasswordForm";
    }

    @GetMapping("/user/detail")
    public String userInfo() {
        return "user/detail";
    }

    @GetMapping("/update/email")
    public String updateEmail() {
        return "user/emailUpdateForm";
    }

    @GetMapping("/update/nickname")
    public String updateNickname() {
        return "user/nicknameUpdateForm";
    }

    @GetMapping("/update/password")
    public String updatePassword() {
        return "user/passwordUpdateForm";
    }

    @GetMapping("/user/delete")
    public String deleteAccount() {
        return "user/deleteAccountForm";
    }
}
