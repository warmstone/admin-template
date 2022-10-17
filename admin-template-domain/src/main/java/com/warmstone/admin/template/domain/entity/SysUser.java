package com.warmstone.admin.template.domain.entity;

import lombok.Data;

/**
 * @author pengshun
 * @date 2022-10-17 21:34
 * @description
 */
@Data
public class SysUser extends BaseEntity{

    private Long id;

    private String username;

    private String password;
}
