/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: FreshConfigUtil
 * Author:   苏晨宇
 * Date:     2020/12/11 18:27
 * Description: post方式refresh 消息总线
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.how2java.springcloud.util;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br>
 * 〈post方式refresh 消息总线〉
 *
 * @author 苏晨宇
 * @create 2020/12/11
 * @since 1.0.0
 */
public class FreshConfigUtil {
    public static void main(String[] args) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=utf-8");
        System.out.println("从git获取 刷新config-server 请耐心等待");
        String result = HttpUtil.createPost("http://localhost:8012/actuator/bus-refresh").addHeaders(headers).execute().body();
        System.out.println("result:" + result);
        System.out.println("refresh 完成");

    }
}
 
