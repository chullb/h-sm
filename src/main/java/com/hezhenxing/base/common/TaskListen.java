package com.hezhenxing.base.common;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Administrator on 2016/4/27.
 */
public class TaskListen implements ServletContextListener {

    private static Logger logger = Logger.getLogger(TaskListen.class);

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("程序开始执行TaskListen.contextInitialized()..");

        //spring初始化上下文
        ServletContext servletcontext = servletContextEvent.getServletContext();
        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletcontext);
        SpringContextUtil.setApplicationContextStaticlly(applicationContext);

    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("程序结束执行TaskListen.contextDestroyed()..");
    }
}
