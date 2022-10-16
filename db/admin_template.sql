DROP TABLE IF EXISTS `sys_user`;
-- 系统用户表
CREATE TABLE `sys_user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `nickname` varchar(50) COMMENT '昵称',
  `password` varchar(100) COMMENT '密码',
  `salt` varchar(20) COMMENT '盐',
  `email` varchar(100) COMMENT '邮箱',
  `mobile` varchar(100) COMMENT '手机号',
  `status` tinyint(1) COMMENT '状态  0：禁用   1：正常',
  `is_delete` tinyint(1) COMMENT '删除标志,0 未删除 1删除',
  `create_user` bigint(20) COMMENT '创建者ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` bigint(20) COMMENT '修改人',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8mb4 COMMENT='系统用户表';

DROP TABLE IF EXISTS `sys_role`;
-- 系统角色表
CREATE TABLE `sys_role` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `role_name` varchar(30) COMMENT '角色名称',
  `role_code` varchar(30) COMMENT '角色代码',
  `is_delete` tinyint(1) COMMENT '删除标志',
  `create_user` bigint(20) COMMENT '创建者ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` bigint(20) COMMENT '修改人',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8mb4 COMMENT='系统角色表';

DROP TABLE IF EXISTS `sys_menu`;
-- 系统权限表
CREATE TABLE `sys_menu` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `menu_url` varchar(50) COMMENT '菜单路径',
    `menu_level` int(30) COMMENT '菜单级别',
    `parent_id` bigint COMMENT '父级菜单',
    `menu_type` tinyint(4) COMMENT '菜单类别，0 页面 1 按钮',
    `is_delete` tinyint(1) COMMENT '删除标志',
    `create_user` bigint(20) COMMENT '创建者ID',
    `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_user` bigint(20) COMMENT '修改人',
    `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8mb4 COMMENT='系统权限表';


DROP TABLE IF EXISTS `sys_user_role_r`;
-- 系统用户角色关联表
CREATE TABLE `sys_user_role_r` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` varchar(30) COMMENT '用户ID',
  `role_id` varchar(30) COMMENT '角色ID',
  `is_delete` tinyint(1) COMMENT '删除标志',
  `create_user` bigint(20) COMMENT '创建者ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` bigint(20) COMMENT '修改人',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8mb4 COMMENT='系统用户角色关联表';

DROP TABLE IF EXISTS `sys_role_menu_r`;
-- 系统角色菜单关联表
CREATE TABLE `sys_role_menu_r` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `role_id` varchar(30) COMMENT '角色ID',
  `menu_id` varchar(30) COMMENT '菜单ID',
  `is_delete` tinyint(1) COMMENT '删除标志',
  `create_user` bigint(20) COMMENT '创建者ID',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_user` bigint(20) COMMENT '修改人',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=`InnoDB` DEFAULT CHARACTER SET utf8mb4 COMMENT='系统角色权限关联表';