package com.itsz.febs.server.system.modules.menu.mapper;


import com.itsz.febs.server.system.modules.menu.domain.TMenu;
import com.itsz.febs.server.system.modules.menu.dto.QueryMenuReqDto;

import java.util.List;

public interface TMenuMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(TMenu record);

    int insertSelective(TMenu record);

    TMenu selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(TMenu record);

    int updateByPrimaryKey(TMenu record);

    List<TMenu> queryByCondition(QueryMenuReqDto request);

    List<TMenu> queryAll();
}