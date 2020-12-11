/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductClientRibbon
 * Author:   苏晨宇
 * Date:     2020/12/11 10:36
 * Description: Ribbon客户端
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.springcloud.client;

import com.how2java.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Ribbon客户端〉
 *
 * @author 苏晨宇
 * @create 2020/12/11
 * @since 1.0.0
 */
@Component
public class ProductClientRibbon {
    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProducts(){
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
    }
}
 
