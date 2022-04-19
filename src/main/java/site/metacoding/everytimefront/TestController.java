package site.metacoding.everytimefront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

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

    @GetMapping("/message")
    public String message() {
        return "message/messageForm";
    }

    @GetMapping("/main")
    public String home() {
        return "post/main";
    }

    @GetMapping("/community")
    public String community() {
        return "qna/communityRule";
    }

    @GetMapping("/qnaForm")
    public String qnaForm() {
        return "qna/qnaForm";
    }

    @GetMapping("/post/detail")
    public String detail() {
        return "post/detail";
    }

    @GetMapping("/user/certificate-registration")
    public String certificateForm() {
        return "user/certificateRegistrationForm";
    }
}
