package com.minws.ws.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.render.ViewType;
import com.minws.ws.auth.AuthController;
import com.minws.ws.frame.kit.ProsMap;
import com.minws.ws.page.PageController;

/**
 * API引导式配置
 */
public class AppConfig extends JFinalConfig {
	
	/**
	 * 配置常量
	 */
	public void configConstant(Constants me) {
		me.setDevMode(ProsMap.getBooPro("ws.devMode"));
		me.setViewType(ViewType.JSP); 							// 设置视图类型为Jsp，否则默认为FreeMarker
	}
	
	/**
	 * 配置路由
	 */
	public void configRoute(Routes me) {
		me.add("/", PageController.class, "/page");
		me.add("/auth", AuthController.class, "/auth");
	}
	
	/**
	 * 配置插件
	 */
	public void configPlugin(Plugins me) {
		
	}
	
	/**
	 * 配置全局拦截器
	 */
	public void configInterceptor(Interceptors me) {
		
	}
	
	/**
	 * 配置处理器
	 */
	public void configHandler(Handlers me) {
		
	}
	
	/**
	 * 建议使用 JFinal 手册推荐的方式启动项目
	 * 运行此 main 方法可以启动项目，此main方法可以放置在任意的Class类定义中，不一定要放于此
	 */
	public static void main(String[] args) {
		JFinal.start("webapp", 80, "/", 5);
	}
}
