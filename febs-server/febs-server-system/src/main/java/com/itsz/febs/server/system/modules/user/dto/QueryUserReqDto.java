package com.itsz.febs.server.system.modules.user.dto;

import lombok.Data;

@Data
public class QueryUserReqDto {

    private String username;

    private String mobile;

    private String email;
}
