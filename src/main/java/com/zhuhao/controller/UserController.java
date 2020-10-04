package com.zhuhao.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.RequestData;
import com.base.ResponseData;
import com.zhuhao.bean.User;
import com.zhuhao.service.impl.UserServiceImpl;

/**
 * 该类作为springboot和nginx的配合使用类，
 * 要不是演示动静分离不要写在这里面
 * @author 56525
 * 1、nginx启动后发送：localhost或者http://localhost/springboot/login/login.html进入登陆页面
 * 2、点击登陆按钮即可看到前后台交互
 * 3、注意该工程的端口要是8080，nginx是这么配置的
 */
@RestController // 替换@ResponseBody和@Controller，默认将返回数据包装成json格式
@RequestMapping("/login")
public class UserController {

	@Autowired
	private User user;
	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping("/hello")
	public ResponseData hello(@RequestBody RequestData request) {
		Map<String, Object> paramMap = request.getDataMap();
		System.out.println("入参：" + paramMap);
		Map<String, Object> map = new HashMap<>();
		ResponseData rsp = new ResponseData();
		if (null == paramMap || paramMap.isEmpty()) {
			map.put("status", "0");
			map.put("result", "用户名密码不能为空，请重新登陆！");
			rsp.setRspBody(map);
			return rsp;
		}
		// 校验用户是否存在
		user = userServiceImpl.checkUser(paramMap);
		if (null == user) {
			map.put("status", "0");
			map.put("result", "用户不存在，请重新登陆！");
			rsp.setRspBody(map);
			return rsp;
		} else {
			map.put("status", "1");
			map.put("result", user);
			rsp.setRspBody(map);
			return rsp;
		}
	}

	/**
	 * 下载linux服务器中的附件
	 * @param request
	 * @return
	 */
	@RequestMapping("/uploadLinux")
	public ResponseData uploadLinux(@RequestBody RequestData request) {
		Map<String, Object> paramMap = request.getDataMap();
		System.out.println("入参：" + paramMap);
		ResponseData rsp = new ResponseData();
		Map<String, Object> map = new HashMap<>();
		map.put("status", "1");
		rsp.setRspBody(map);
		return rsp;
	}

}