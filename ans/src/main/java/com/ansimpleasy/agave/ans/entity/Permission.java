package com.ansimpleasy.agave.ans.entity;

import com.ansimpleasy.agave.ans.entity.base.StatefulBaseEntity;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author liucan
 * @since 2019-08-11
 */
@Data
public class Permission extends StatefulBaseEntity {

    private String name;

    private String description;

}