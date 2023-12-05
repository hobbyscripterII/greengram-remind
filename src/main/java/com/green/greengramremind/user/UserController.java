package com.green.greengramremind.user;

import com.green.greengramremind.user.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {
    private final UserService userService;

    @PostMapping("signup")
    public ResVo signUp(@RequestBody UserSignUpDto dto) {
        return userService.signUp(dto);
    }

    @PostMapping("signin")
    public UserSignInVo signIn(@RequestBody UserSignInDto dto) {
        // 1. 성공 2. 아이디 없음 3. 비밀번호 틀림
        return userService.signIn(dto);
    }

//    @GetMapping
//    public UserInfoVo getUserInfo(@RequestBody UserInfoDto dto) {
//        return userService.getUserInfo(dto);
//    }
}
