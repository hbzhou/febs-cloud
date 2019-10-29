package com.itsz.febs.server.system.modules.role.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.role.domain.TRole;
import com.itsz.febs.server.system.modules.role.dto.QueryRoleReqDto;
import com.itsz.febs.server.system.modules.role.mapper.TRoleMapper;
import com.itsz.febs.server.system.modules.role.service.TRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TRoleServiceImpl implements TRoleService {

    @Autowired
    private TRoleMapper tRoleMapper;

    @Override
    public int deleteByPrimaryKey(Long roleId) {
        return tRoleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int insert(TRole record) {
        return tRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(TRole record) {
        return tRoleMapper.insertSelective(record);
    }

    @Override
    public TRole selectByPrimaryKey(Long roleId) {
        return tRoleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public int updateByPrimaryKeySelective(TRole record) {
        return tRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TRole record) {
        return tRoleMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<TRole> queryByPage(QueryRoleReqDto request, int page, int pageSize) {
        PageHelper.startPage(page,pageSize,true);
        List<TRole> roleList = tRoleMapper.queryByCondition(request);
        PageInfo<TRole> pageInfo = new PageInfo<>(roleList);
        return pageInfo;
    }


}
