package com.example.springbootdemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
@ApiModel(value = "Role", description = "角色")
public class Role {
    @ApiModelProperty("角色id")
    private Long id;
    @ApiModelProperty("角色名称")
    private String roleName;
    @ApiModelProperty("角色权限")
    private List<Privilege> privileges;


}
