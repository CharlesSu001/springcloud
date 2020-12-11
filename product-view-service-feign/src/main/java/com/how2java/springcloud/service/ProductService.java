/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductService
 * Author:   苏晨宇
 * Date:     2020/12/11 14:20
 * Description: 服务类 从ProductClientFeign中获取
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.springcloud.service;

import com.how2java.springcloud.client.ProductClientFeign;
import com.how2java.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈服务类 从ProductClientFeign中获取〉
 *
 * @author 苏晨宇
 * @create 2020/12/11
 * @since 1.0.0
 */
@Service
public class ProductService {
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
        return productClientFeign.listProducts();
    }
}
 
