package com.samples.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.redbean.dubbo.samples.api.user.UserExportService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by GL on 2016/12/22.
 */
@Controller
@RequestMapping("/")
public class UserController {

  @Reference(group = "test",version = "100.0")
  private UserExportService userExportService;

  @RequestMapping("/")
  @ResponseBody
  public String index(){
    return userExportService.doSomething(null).getName();
  }

}
