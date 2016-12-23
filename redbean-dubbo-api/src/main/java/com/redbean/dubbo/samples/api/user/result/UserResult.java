package com.redbean.dubbo.samples.api.user.result;

import java.io.Serializable;

/**
 * Created by GL on 2016/11/24.
 */
public class UserResult implements Serializable {
  private static final long serialVersionUID = 6880784087798297L;

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
