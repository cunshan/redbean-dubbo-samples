package com.redbean.dubbo.samples.api.user;

import com.redbean.dubbo.samples.api.user.param.UserParam;
import com.redbean.dubbo.samples.api.user.result.UserResult;

/**
 * Created by GL on 2016/11/24.
 */
public interface UserExportService {

  UserResult doSomething(UserParam param);
}
