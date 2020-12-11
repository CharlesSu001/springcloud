/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductService
 * Author:   苏晨宇
 * Date:     2020/12/10 16:12
 * Description: 服务类提供Product集合 放进端口号 集群中区分数据服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.springcloud.service;

import com.how2java.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈服务类提供Product集合 放进端口号 集群中区分数据服务〉
 *
 * @author 苏晨宇
 * @create 2020/12/10
 * @since 1.0.0
 */
@Service
public class ProductService {
    @Value("${server.port}")
    String port;

    public List<Product> listProducts(){
        List<Product> ps=new ArrayList<>();
        ps.add(new Product(1,"product a from port: "+port,50));
        ps.add(new Product(2,"product a from port: "+port,150));
        ps.add(new Product(3,"product a from port: "+port,250));
        return ps;

    }
}
 
