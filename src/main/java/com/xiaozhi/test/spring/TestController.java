package com.xiaozhi.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author huangzhi on 2019-11-12.
 */
@Controller
public class TestController {

    @RequestMapping("test")
    public String webtest() {
        return "hello world";
    }
}
