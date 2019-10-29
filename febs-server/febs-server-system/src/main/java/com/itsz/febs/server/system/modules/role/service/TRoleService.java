package com.itsz.febs.server.system.modules.role.service;


import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.role.domain.TRole;
import com.itsz.febs.server.system.modules.role.dto.QueryRoleReqDto;

public interface TRoleService{


    int deleteByPrimaryKey(Long roleId);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);

    PageInfo<TRole> queryByPage(QueryRoleReqDto request, int page, int pageSize);
}
