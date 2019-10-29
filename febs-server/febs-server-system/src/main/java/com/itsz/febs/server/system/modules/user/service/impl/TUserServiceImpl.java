package com.itsz.febs.server.system.modules.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.user.domain.TUser;
import com.itsz.febs.server.system.modules.user.dto.QueryUserReqDto;
import com.itsz.febs.server.system.modules.user.mapper.TUserMapper;
import com.itsz.febs.server.system.modules.user.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TUserServiceImpl implements TUserService {

    @Resource
    private TUserMapper tUserMapper;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public int deleteByPrimaryKey(Long userId) {
        return tUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(TUser record) {
        return tUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TUser record) {
        record.setPassword(passwordEncoder.encode("123456"));
        return tUserMapper.insertSelective(record);
    }

    @Override
    public TUser selectByPrimaryKey(Long userId) {
        return tUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(TUser record) {
        return tUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TUser record) {
        return tUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageInfo<TUser> selectByPage(QueryUserReqDto request, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<TUser> userList =  tUserMapper.selectByPage(request);
        PageInfo<TUser> pageInfo = new PageInfo<TUser>(userList);
        return pageInfo;

    }

}
