package com.itsz.febs.server.system.modules.dept.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.dept.domain.TDept;
import com.itsz.febs.server.system.modules.dept.dto.QueryDeptReqDto;
import com.itsz.febs.server.system.modules.dept.mapper.TDeptMapper;
import com.itsz.febs.server.system.modules.dept.service.TDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TDeptServiceImpl implements TDeptService {

    @Resource
    private TDeptMapper tDeptMapper;

    @Override
    public int deleteByPrimaryKey(Long deptId) {
        return tDeptMapper.deleteByPrimaryKey(deptId);
    }

    @Override
    public int insert(TDept record) {
        return tDeptMapper.insert(record);
    }

    @Override
    public int insertSelective(TDept record) {
        return tDeptMapper.insertSelective(record);
    }

    @Override
    public TDept selectByPrimaryKey(Long deptId) {
        return tDeptMapper.selectByPrimaryKey(deptId);
    }

    @Override
    public int updateByPrimaryKeySelective(TDept record) {
        return tDeptMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TDept record) {
        return tDeptMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<TDept> queryByPage(QueryDeptReqDto request, int page, int pageSize) {
        PageHelper.startPage(page,pageSize,true);
        List<TDept> deptList = tDeptMapper.queryByCondition(request);
        PageInfo<TDept> deptPageInfo = new PageInfo<>(deptList);
        return deptPageInfo;
    }

    @Override
    public List<TDept> queryAll() {
        return tDeptMapper.queryAll();
    }

}
