package com.hsz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*********************************
 * 类描述：
 * @author huangsz
 * @date 2020/1/10
 **********************************/
@RestController
public class IndexController {

    @GetMapping("/hi")
    public String hi(){
        return "这是第三次上次代码呀，哈哈哈哈!";
    }
}
