package com.example.springbootdemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "Userrole", description = "用户角色详情")
public class UserRole extends UserInfo{
    @ApiModelProperty("角色名称")
    private String roleName;
    @ApiModelProperty("角色等级")
    private int level;
}
