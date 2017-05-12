package com.liuyang.qrcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {

	@RequestMapping(value = { "", "index.html" })
	public String index() {
		return "index";
	}
}
