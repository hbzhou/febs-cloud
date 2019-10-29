package com.itsz.febs.server.system.modules.menu.service;


import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.menu.domain.TMenu;
import com.itsz.febs.server.system.modules.menu.dto.QueryMenuReqDto;

import java.util.List;

public interface TMenuService{


    int deleteByPrimaryKey(Long menuId);

    int insert(TMenu record);

    int insertSelective(TMenu record);

    TMenu selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(TMenu record);

    int updateByPrimaryKey(TMenu record);

    PageInfo<TMenu> queryByPage(QueryMenuReqDto request, int page, int pageSize);

    List<TMenu>  queryAll();
}
