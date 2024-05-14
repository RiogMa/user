package com.yupi.usercenter.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("`user`") // 定义Java类和数据库表之间映射关系的注解
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}