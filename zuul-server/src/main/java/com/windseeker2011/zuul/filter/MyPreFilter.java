package com.windseeker2011.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 预处理拦截器
 * 
 * @author Weihai Li
 *
 */
public class MyPreFilter extends ZuulFilter {

	public static Logger log = LoggerFactory.getLogger(MyPreFilter.class);

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public Object run() {
		RequestContext rc = RequestContext.getCurrentContext();
		HttpServletRequest request = rc.getRequest();

		log.info("{} -> {}", request.getMethod(), request.getRequestURL());

		String token = request.getHeader("token");
		if (StringUtils.isEmpty(token)) {
			rc.setSendZuulResponse(false);
			rc.setResponseStatusCode(401);
		}
		return null;
	}

}
