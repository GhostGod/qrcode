package com.liuyang.qrcode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.liuyang.qrcode.model.VCard;

/**
 * 二维码控制器
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
@RestController
@RequestMapping("qrcode")
public class QRCodeController {

	@RequestMapping(value = "url", method = RequestMethod.POST)
	public void url(String url) {

	}

	@RequestMapping(value = "vcard", method = RequestMethod.POST)
	public void vCard(VCard vCard) {

	}
}
