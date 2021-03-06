package com.minws.ws.frame.interceptor.syslog;

import java.util.Map;

import com.jfinal.core.Controller;

/**
 * 日志处理器
 */
public interface LogProcessor {

    void process(SysLog sysLog);

    String getUsername(Controller c);

    String formatMessage(String title, Map<String, String> message);
}
