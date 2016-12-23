package com.samples.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.redbean.dubbo.samples.api.user.UserExportService;
import com.redbean.dubbo.samples.api.user.param.UserParam;
import com.redbean.dubbo.samples.api.user.result.UserResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by GL on 2016/12/5.
 */
@Service
public class UserService implements UserExportService {

  private static final Logger logger = LoggerFactory.getLogger(UserService.class);

  public UserResult doSomething(UserParam param) {
    logger.info("I am doing something...");
    UserResult result = new UserResult();
    result.setName("aaaa");
    return result;
  }


}
