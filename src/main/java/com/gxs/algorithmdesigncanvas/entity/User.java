package com.gxs.algorithmdesigncanvas.entity;

import lombok.*;

/**
 * FileName: User
 * author: gxs
 * Date: 2022/8/23  11:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class User {
    private Integer userID;
    private String userName;
    private String password;
}
