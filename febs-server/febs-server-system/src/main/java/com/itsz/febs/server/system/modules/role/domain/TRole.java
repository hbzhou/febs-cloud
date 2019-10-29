package com.itsz.febs.server.system.modules.role.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value="com.itsz.rbac.modules.system.role.domain.TRole")
@Data
public class TRole implements Serializable {
    /**
    * 角色ID
    */
    @ApiModelProperty(value="角色ID")
    private Long roleId;

    /**
    * 角色名称
    */
    @ApiModelProperty(value="角色名称")
    private String roleName;

    /**
    * 角色描述
    */
    @ApiModelProperty(value="角色描述")
    private String remark;

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