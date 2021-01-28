package com.xiaozhi.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author huangzhi on 2019-11-12.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String webtest() {
        String a="";
        a+="1";
        return "hello world";


    }
}
