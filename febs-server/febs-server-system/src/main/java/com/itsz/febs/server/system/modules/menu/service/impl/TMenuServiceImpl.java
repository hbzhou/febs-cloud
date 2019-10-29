package com.itsz.febs.server.system.modules.menu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.menu.domain.TMenu;
import com.itsz.febs.server.system.modules.menu.dto.QueryMenuReqDto;
import com.itsz.febs.server.system.modules.menu.mapper.TMenuMapper;
import com.itsz.febs.server.system.modules.menu.service.TMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TMenuServiceImpl implements TMenuService {

    @Resource
    private TMenuMapper tMenuMapper;

    @Override
    public int deleteByPrimaryKey(Long menuId) {
        return tMenuMapper.deleteByPrimaryKey(menuId);
    }

    @Override
    public int insert(TMenu record) {
        return tMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(TMenu record) {
        return tMenuMapper.insertSelective(record);
    }

    @Override
    public TMenu selectByPrimaryKey(Long menuId) {
        return tMenuMapper.selectByPrimaryKey(menuId);
    }

    @Override
    public int updateByPrimaryKeySelective(TMenu record) {
        return tMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TMenu record) {
        return tMenuMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<TMenu> queryByPage(QueryMenuReqDto request, int page, int pageSize) {
        PageHelper.startPage(page, pageSize, true);

        List<TMenu> menuList = tMenuMapper.queryByCondition(request);

        PageInfo<TMenu> pageInfo = new PageInfo<>(menuList);

        return pageInfo;
    }

    @Override
    public List<TMenu> queryAll() {
        return tMenuMapper.queryAll();
    }

}
