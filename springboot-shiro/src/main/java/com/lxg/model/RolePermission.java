package com.lxg.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * RolePermission
 * @author dolyw.com
 * @date 2018/8/31 14:43
 */
@TableName("role_permission")
@Data
public class RolePermission implements Serializable {

    private static final long serialVersionUID = -8564770707000796503L;

    /**
     * ID
     */
    @TableId
    private Integer id;

    /**
     * 角色id
     */
    @TableField("role_id")
    private Integer roleId;

    /**
     * 权限id
     */
    @TableField("permission_id")
    private Integer permissionId;
}