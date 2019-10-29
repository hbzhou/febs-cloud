package com.itsz.febs.server.system.modules.dept.service;


import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.dept.domain.TDept;
import com.itsz.febs.server.system.modules.dept.dto.QueryDeptReqDto;

import java.util.List;

public interface TDeptService{


    int deleteByPrimaryKey(Long deptId);

    int insert(TDept record);

    int insertSelective(TDept record);

    TDept selectByPrimaryKey(Long deptId);

    int updateByPrimaryKeySelective(TDept record);

    int updateByPrimaryKey(TDept record);

    PageInfo<TDept> queryByPage(QueryDeptReqDto request, int page, int pageSize);

    List<TDept> queryAll();
}
