package com.yueqian.boot_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.yueqian.boot_demo.vo.UserInfo;

@Controller
public class DemoController {

	@GetMapping("/")
	public String test() {
		UserInfo info=new UserInfo();
		info.setUserId(1000);
		info.setUserName("zhangsan");
		return "/index.jsp";
	}
}
