package com.itsz.febs.server.system.modules.user.controller;

import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.user.domain.TUser;
import com.itsz.febs.server.system.modules.user.dto.QueryUserReqDto;
import com.itsz.febs.server.system.modules.user.service.TUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(value = "USER",tags = "User")
public class UserController {

    @Autowired
    private TUserService userService;

    @GetMapping("/{id}")
    public TUser queryUserById(@PathVariable(name = "id") long id) {
        return userService.selectByPrimaryKey(id);
    }

    @PostMapping("/")
    public void addUser(@RequestBody TUser user) {
        userService.insertSelective(user);
    }

    @PutMapping("/")
    public void updateUser(@RequestBody TUser user) {
        userService.updateByPrimaryKeySelective(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable(name = "id") long id) {
        userService.deleteByPrimaryKey(id);
    }


    @GetMapping("/page")
    public PageInfo<TUser> queryByPage (@ApiParam(value = "User Page Request", required = true) QueryUserReqDto request,
                                        @ApiParam (value = "page") @RequestParam(defaultValue = "1") int page,
                                        @ApiParam(value = "pageSize") @RequestParam(defaultValue = "5") int pageSize){
        return  userService.selectByPage(request,page, pageSize);
    }



}
