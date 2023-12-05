package com.green.greengramremind.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignInVo {
    private int result;
    private int iuser;
    @JsonIgnore
    private String upw;
    private String nm;
    private String pic;
}
