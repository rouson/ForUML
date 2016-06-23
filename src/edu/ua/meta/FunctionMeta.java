/**
 * Copyright (c) 2013 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Aziz Nanthaamornphong
 */
package edu.ua.meta;

import java.util.*;

public class FunctionMeta {

  private String name;
  private String returnType = "";
  private ArrayList parameters = new ArrayList();
  int currentParam = 0;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setReturnType(String name) {
    this.returnType = name;
  }

  public String getReturnType() {
    return this.returnType;
  }

  public void addParameters(ParameterMeta param) {
    parameters.add(param);
  }

  public ArrayList getParameters() {
    return this.parameters;
  }

  public ParameterMeta getNextParameter() {
    ParameterMeta ret = null;

    if (parameters.size() > currentParam) {
      ret = (ParameterMeta) parameters.get(currentParam);
      currentParam++;
    }
    return ret;
  }
}