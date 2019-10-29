package com.itsz.febs.server.system.modules.user.mapper;


import com.itsz.febs.server.system.modules.user.domain.TUser;
import com.itsz.febs.server.system.modules.user.dto.QueryUserReqDto;

import java.util.List;

public interface TUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    List<TUser> selectByPage(QueryUserReqDto param);

    TUser findByUserName(String username);
}