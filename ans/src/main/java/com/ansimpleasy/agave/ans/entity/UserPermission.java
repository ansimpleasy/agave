package com.ansimpleasy.agave.ans.entity;

import com.ansimpleasy.agave.ans.entity.base.BaseEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author liucan
 * @since 2019-08-11
 */

public class UserPermission extends BaseEntity {
    private long permissionId;

    private long userId;

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
