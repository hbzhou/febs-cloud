package com.itsz.febs.server.system.modules.dept.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value="com.itsz.rbac.modules.dept.domain.TDept")
@Data
public class TDept implements Serializable {
    /**
    * 部门ID
    */
    @ApiModelProperty(value="部门ID")
    private Long deptId;

    /**
    * 上级部门ID
    */
    @ApiModelProperty(value="上级部门ID")
    private Long parentId;

    /**
    * 部门名称
    */
    @ApiModelProperty(value="部门名称")
    private String deptName;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 修改时间
    */
    @ApiModelProperty(value="修改时间")
    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}