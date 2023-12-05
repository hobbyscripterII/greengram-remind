package com.green.greengramremind.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignUpDto {
    @JsonIgnore // 응답 값에 표시되지 않는다.(무시된다)
    private int iuser;
    private String uid;
    private String upw;
    private String nm;
    private String pic;
}
