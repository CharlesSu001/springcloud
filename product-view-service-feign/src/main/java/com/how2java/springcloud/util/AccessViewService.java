/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: AccessViewService
 * Author:   苏晨宇
 * Date:     2020/12/11 20:01
 * Description: 不停访问的类 便于监控
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.springcloud.util;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.http.HttpUtil;

/**
 * 〈一句话功能简述〉<br>
 * 〈不停访问的类 便于监控〉
 *
 * @author 苏晨宇
 * @create 2020/12/11
 * @since 1.0.0
 */
public class AccessViewService {
    public static void main(String[] args) {
        while (true) {
            ThreadUtil.sleep(1000);
            access(8012);
            access(8013);
        }
    }

    public static void access(int port) {
        try {
            String html = HttpUtil.get(String.format("http://127.0.0.1:%d/products", port));
            System.out.printf("%d 地址的视图微服务访问成功 ，返回大小是%d%n", port, html.length());
        } catch (Exception e) {
            System.err.printf("%d地址的视图微服务无法访问%n", port);
        }
    }
}
 
