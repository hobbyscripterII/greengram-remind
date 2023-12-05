package com.green.greengramremind.user;

import com.green.greengramremind.Const;
import com.green.greengramremind.user.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public ResVo signUp(UserSignUpDto dto) {
        // new ResVo()에 담을 값으로 default 값은 실패 값인 0이다.
        int result = 0;
        // 패스워드 암호화
        String hashedPw = BCrypt.hashpw(dto.getUpw(), BCrypt.gensalt());
        // 암호화한 패스워드를 쿼리문에 보내기 위해 setter를 호출한다.
        dto.setUpw(hashedPw);

        // insert에 성공할 경우(1이 반환될 경우) return 값으로 회원의 PK를 result에 담는다.
        if (userMapper.signUp(dto) == 1) {
            result = dto.getIuser();
        }
        return new ResVo(result);
    }

    public UserSignInVo signIn(UserSignInDto dto) {
        UserSignInVo vo = userMapper.signIn(dto.getUid());
        boolean result = BCrypt.checkpw(dto.getUpw(), vo.getUpw());
        if(vo == null) { // 찾을 수 없는 아이디
            vo.setResult(Const.NO_UID);
        } else if(result) { // 패스워드 일치
            vo.setResult(Const.SUCCESS);
        } else { // 패스워드 불일치
            vo.setResult(Const.WRONG_UPW);
        }
        return vo;
    }

//    UserInfoVo getUserInfo(UserInfoDto dto) {
//
//    }
}
