package com.itsz.febs.server.system.modules.user.service;


import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.user.domain.TUser;
import com.itsz.febs.server.system.modules.user.dto.QueryUserReqDto;

public interface TUserService{


    int deleteByPrimaryKey(Long userId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    PageInfo<TUser> selectByPage(QueryUserReqDto request, int page, int pageSize);
}

