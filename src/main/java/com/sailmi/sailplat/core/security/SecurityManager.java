package com.sailmi.sailplat.core.security;

import java.util.Map;

public abstract interface SecurityManager
{
  public abstract Map<String, String> loadUrlAuthorities();
}
