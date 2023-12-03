package com.green.greengramremind.user;

import com.green.greengramremind.user.model.ResVo;
import com.green.greengramremind.user.model.UserSignInDto;
import com.green.greengramremind.user.model.UserSignInVo;
import com.green.greengramremind.user.model.UserSignUpDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {
    private final UserService userService;

    @PostMapping("signup")
    public ResVo signUp(@RequestBody UserSignUpDto dto) {
        return new ResVo(0);
    }

    @PostMapping("signin")
    public UserSignInVo signIn(@RequestBody UserSignInDto dto) {
        // 1. 성공 2. 아이디 없음 3. 비밀번호 틀림
        return null;
    }
}
