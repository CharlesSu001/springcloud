/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductController
 * Author:   苏晨宇
 * Date:     2020/12/11 10:41
 * Description: 数据取出来放到html中
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.springcloud.web;

import com.how2java.springcloud.pojo.Product;
import com.how2java.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈数据取出来放到html中〉
 *
 * @author 苏晨宇
 * @create 2020/12/11
 * @since 1.0.0
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/products")
    public Object products(Model m){
        List<Product> ps=productService.listProducts();
        m.addAttribute("ps",ps);
        return "products";
    }
}
 
