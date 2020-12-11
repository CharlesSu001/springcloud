/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Product
 * Author:   苏晨宇
 * Date:     2020/12/10 16:09
 * Description: 实体类Product
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.springcloud.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈实体类Product〉
 *
 * @author 苏晨宇
 * @create 2020/12/10
 * @since 1.0.0
 */
public class Product {
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
 
