package com.itsz.febs.server.system.modules.dept.controller;

import com.github.pagehelper.PageInfo;
import com.itsz.febs.server.system.modules.dept.domain.TDept;
import com.itsz.febs.server.system.modules.dept.dto.QueryDeptReqDto;
import com.itsz.febs.server.system.modules.dept.service.TDeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/dept")
@Api(value = "DEPT", tags = "Dept")
public class DeptController {

    @Autowired
    private TDeptService deptService;


    @GetMapping("/{id}")
    public TDept queryDeptById(@PathVariable(name = "id") long id) {
        return deptService.selectByPrimaryKey(id);
    }

    @PostMapping("/")
    public void addDept(@RequestBody TDept dept) {
        deptService.insertSelective(dept);
    }

    @PutMapping("/")
    public void updateDept(@RequestBody TDept dept) {
        deptService.updateByPrimaryKeySelective(dept);
    }

    @DeleteMapping("/{id}")
    public void deleteDept(@PathVariable(name = "id") long id) {
        deptService.deleteByPrimaryKey(id);
    }


    @GetMapping("/page")
    public PageInfo<TDept> queryDeptByPage(@ApiParam(value = "Dept page params", required = true) QueryDeptReqDto request,
                                           @ApiParam(value = "current page", required = true) @RequestParam(name = "page", defaultValue = "1") int page,
                                           @ApiParam(value = "page size", required = true) @RequestParam(name = "pageSize", defaultValue = "5") int pageSize){
        return deptService.queryByPage(request, page, pageSize);
    }

    @GetMapping("/")
    public List<TDept> queryAll(){
        return  deptService.queryAll();
    }
}
