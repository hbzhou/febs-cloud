package com.itsz.febs.server.system.modules.dept.mapper;


import com.itsz.febs.server.system.modules.dept.domain.TDept;
import com.itsz.febs.server.system.modules.dept.dto.QueryDeptReqDto;

import java.util.List;

public interface TDeptMapper {
    int deleteByPrimaryKey(Long deptId);

    int insert(TDept record);

    int insertSelective(TDept record);

    TDept selectByPrimaryKey(Long deptId);

    int updateByPrimaryKeySelective(TDept record);

    int updateByPrimaryKey(TDept record);

    List<TDept> queryByCondition(QueryDeptReqDto request);

    List<TDept> queryAll();
}