package com.redbean.dubbo.samples.api.user.param;

import java.io.Serializable;

/**
 * Created by GL on 2016/11/24.
 */
public class UserParam implements Serializable {

  private static final long serialVersionUID = -6778274288723092393L;

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
