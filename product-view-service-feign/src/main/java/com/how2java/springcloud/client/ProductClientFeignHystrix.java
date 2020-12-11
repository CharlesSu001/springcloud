/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductClientFeignHystrix
 * Author:   苏晨宇
 * Date:     2020/12/11 19:27
 * Description: 实现ProductClientFeign接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.springcloud.client;

import com.how2java.springcloud.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈实现ProductClientFeign接口〉
 *
 * @author 苏晨宇
 * @create 2020/12/11
 * @since 1.0.0
 */
@Component
public class ProductClientFeignHystrix implements ProductClientFeign {

    @Override
    public List<Product> listProducts() {
        List<Product> result = new ArrayList<>();
        result.add(new Product(0, "产品数据微服务不可用", 0));
        return result;
    }
}
 
