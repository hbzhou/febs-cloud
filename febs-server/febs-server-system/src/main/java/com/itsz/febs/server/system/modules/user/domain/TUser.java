package com.itsz.febs.server.system.modules.user.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@ApiModel(value = "com.itsz.rbac.modules.user.domain.TUser")
@Data
public class TUser implements Serializable {
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 部门ID
     */
    @ApiModelProperty(value = "部门ID")
    private Long deptId;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话")
    private String mobile;

    /**
     * 状态 0锁定 1有效
     */
    @ApiModelProperty(value = "状态 0锁定 1有效")
    private String status;

    /**
     * 创建时间
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyTime;

    /**
     * 最近访问时间
     */
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @ApiModelProperty(value = "最近访问时间")
    private LocalDateTime lastLoginTime;

    /**
     * 性别 0男 1女 2保密
     */
    @ApiModelProperty(value = "性别 0男 1女 2保密")
    private String sex;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    private String description;


    @ApiModelProperty(value = "部门名称")
    private String deptName;

    private static final long serialVersionUID = 1L;
}