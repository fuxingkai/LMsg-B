package com.frank.lmsg.controller;

import com.frank.lmsg.base.utils.ResponseUtils;
import com.frank.lmsg.base.vo.ResponseVO;
import com.frank.lmsg.service.IUserService;
import com.frank.lmsg.vo.req.WxLoginVO;
import com.frank.lmsg.vo.resp.Greeting;
import com.frank.lmsg.vo.resp.UserInfoVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Description: 用户信息控制类
 * Auth: Frank
 * Date: 2019-08-09
 * Time: 下午 1:38
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO<UserInfoVo> login(@RequestBody WxLoginVO loginVO) throws Exception {
        return userService.login(loginVO);
    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
