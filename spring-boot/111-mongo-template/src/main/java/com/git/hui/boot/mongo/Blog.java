package com.git.hui.boot.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author jiangxg
 * @version 2019/11/22
 */
@Data
public class Blog implements Serializable {

    @Id
    private String id;
    private String name;
    private String desc;
    private Integer age;
}