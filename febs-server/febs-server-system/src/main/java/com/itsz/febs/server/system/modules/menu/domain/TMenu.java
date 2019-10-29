package com.itsz.febs.server.system.modules.menu.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value="com.itsz.rbac.modules.system.menu.domain.TMenu")
@Data
public class TMenu implements Serializable {


    /**
    * 菜单/按钮ID
    */
    @ApiModelProperty(value="菜单/按钮ID")
    private Long menuId;

    /**
    * 上级菜单ID
    */
    @ApiModelProperty(value="上级菜单ID")
    private Long parentId;

    /**
    * 菜单/按钮名称
    */
    @ApiModelProperty(value="菜单/按钮名称")
    private String menuName;

    /**
    * 对应路由path
    */
    @ApiModelProperty(value="对应路由path")
    private String path;

    /**
    * 对应路由组件component
    */
    @ApiModelProperty(value="对应路由组件component")
    private String component;

    /**
    * 权限标识
    */
    @ApiModelProperty(value="权限标识")
    private String perms;

    /**
    * 图标
    */
    @ApiModelProperty(value="图标")
    private String icon;

    /**
    * 类型 0菜单 1按钮
    */
    @ApiModelProperty(value="类型 0菜单 1按钮")
    private String type;

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

}