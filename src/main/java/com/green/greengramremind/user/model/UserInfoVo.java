package com.green.greengramremind.user.model;

import lombok.Getter;

@Getter
public class UserInfoVo {
    private int feedCnt;
    private int favCnt;
    private String nm;
    private String createdAt;
    private String pic;
    private int follower;
    private int following;
    private int followState;
}
