/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductController
 * Author:   苏晨宇
 * Date:     2020/12/10 16:17
 * Description: 控制器类 把P[roduct集合转换成json数组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.springcloud.controller;

import com.how2java.springcloud.pojo.Product;
import com.how2java.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈控制器类 把P[roduct集合转换成json数组〉
 *
 * @author 苏晨宇
 * @create 2020/12/10
 * @since 1.0.0
 */
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public Object products(){
        List<Product> ps=productService.listProducts();
        return ps;
    }
}
 
