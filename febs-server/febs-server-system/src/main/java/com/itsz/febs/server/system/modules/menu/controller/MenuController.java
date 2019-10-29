package com.itsz.febs.server.system.modules.menu.controller;

import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.menu.domain.TMenu;
import com.itsz.febs.server.system.modules.menu.dto.QueryMenuReqDto;
import com.itsz.febs.server.system.modules.menu.service.TMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/menu")
@Api(value = "MENU", tags = "System" )
public class MenuController {

    @Autowired
    private TMenuService menuService;


    @GetMapping("/{id}")
    public TMenu queryMenuById(@PathVariable(name = "id") long id) {
        return menuService.selectByPrimaryKey(id);
    }

    @PostMapping("/")
    public void addMenu(@RequestBody TMenu menu) {
        menuService.insertSelective(menu);
    }

    @PutMapping("/")
    public void updateMenu(@RequestBody TMenu menu) {
        menuService.updateByPrimaryKeySelective(menu);
    }

    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable(name = "id") long id) {
        menuService.deleteByPrimaryKey(id);
    }

    @GetMapping("/page")
    public PageInfo<TMenu> queryMenuByPage(@ApiParam(value = "query men param") QueryMenuReqDto request,
                                           @ApiParam(value = "page number", defaultValue = "1" )@RequestParam(defaultValue = "1") int page,
                                           @ApiParam(value="page size", defaultValue = "5") @RequestParam(defaultValue = "5") int pageSize){

         return menuService.queryByPage(request,page,pageSize);
    }

    @GetMapping("/")
    public List<TMenu> queryAll(){
        return menuService.queryAll();
    }

}
