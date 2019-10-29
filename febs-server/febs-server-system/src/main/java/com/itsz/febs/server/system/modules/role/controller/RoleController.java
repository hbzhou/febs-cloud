package com.itsz.febs.server.system.modules.role.controller;

import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.role.domain.TRole;
import com.itsz.febs.server.system.modules.role.dto.QueryRoleReqDto;
import com.itsz.febs.server.system.modules.role.service.TRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/role")
@Api(value = "ROLE", tags = "System")
public class RoleController {

    @Autowired
    private TRoleService roleService;


    @GetMapping("/{id}")
    public TRole queryRoleById(@PathVariable(name = "id") long id) {
        return roleService.selectByPrimaryKey(id);
    }

    @PostMapping("/")
    public void addRole(@RequestBody TRole role) {
        roleService.insertSelective(role);
    }

    @PutMapping("/")
    public void updateRole(@RequestBody TRole role) {
        roleService.updateByPrimaryKeySelective(role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable(name = "id") long id) {
        roleService.deleteByPrimaryKey(id);
    }

    @GetMapping("/page")
    public PageInfo<TRole> queryRolesByPage(@ApiParam(value = "query roles params") QueryRoleReqDto request,
                                     @ApiParam(value = "Page Number") @RequestParam(defaultValue = "1") int page,
                                     @ApiParam(value = "Page Size") @RequestParam(defaultValue = "5") int pageSize){
        return roleService.queryByPage(request,page,pageSize);
    }
}
