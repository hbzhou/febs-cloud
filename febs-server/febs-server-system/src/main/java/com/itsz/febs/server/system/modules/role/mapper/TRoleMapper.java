package com.itsz.febs.server.system.modules.role.mapper;


import com.itsz.febs.server.system.modules.role.domain.TRole;
import com.itsz.febs.server.system.modules.role.dto.QueryRoleReqDto;

import java.util.List;

public interface TRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);

    List<TRole> queryAll();

    List<TRole> queryByCondition(QueryRoleReqDto request);
}