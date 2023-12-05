package com.green.greengramremind.user;

import com.green.greengramremind.user.model.UserSignInDto;
import com.green.greengramremind.user.model.UserSignInVo;
import com.green.greengramremind.user.model.UserSignUpDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int signUp(UserSignUpDto dto);
    UserSignInVo signIn(String uid);
}
