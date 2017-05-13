package com.liuyang.qrcode.controller;

import java.io.IOException;

import javax.servlet.ServletOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.zxing.WriterException;
import com.liuyang.qrcode.model.VCard;
import com.liuyang.qrcode.util.QRCodeUtil;

/**
 * 二维码控制器
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
@Controller
@RequestMapping("qrcode")
public class QRCodeController {

	private static final Logger logger = LoggerFactory.getLogger(QRCodeController.class);

	@RequestMapping(value = "url")
	public void url(String value, ServletOutputStream out) {
		text(value, out);
	}

	@RequestMapping(value = "vcard")
	public void vCard(VCard vCard, ServletOutputStream out) {
		try {
			QRCodeUtil.writeToStream(vCard, out);
		} catch (WriterException e) {
			logger.warn("生成二维码异常", e);
		} catch (IOException e) {
			logger.warn("IO异常", e);
		}
	}

	@RequestMapping(value = "text")
	public void text(String value, ServletOutputStream out) {
		if (!StringUtils.hasText(value)) {
			return;
		}
		try {
			QRCodeUtil.writeToStream(value, out);
		} catch (WriterException e) {
			logger.warn("生成二维码异常", e);
		} catch (IOException e) {
			logger.warn("IO异常", e);
		}
	}
}
