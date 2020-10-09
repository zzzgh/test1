package com.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangganghui
 * @version 1.0.0
 * @package com.test
 * @className Person
 * @date 2020-10-09  14:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;
    private int age;
}
