package com.liuyang.qrcode;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class VCardQRCode {
	public static void main(String[] args) {
		try {
			String content = "BEGIN:VCARD\n" + "VERSION:3.0\n" + "N:李德伟\n" + "EMAIL:1606841559@qq.com\n"
					+ "TEL:12345678912" + "TEL;CELL:12345678912" + "ADR:山东济南齐鲁软件园\n" + "ORG:" + "济南\n"
					+ "TITLE:软件工程师\n" + "URL:http://blog.csdn.net/lidew521\n" + "NOTE:呼呼测试下吧。。。\n" + "END:VCARD";
			String path = "D:/";

			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();

			Map<EncodeHintType, String> hints = new HashMap<>();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, 400, 400, hints);
			File file1 = new File(path, "名片.jpg");
			MatrixToImageWriter.writeToFile(bitMatrix, "jpg", file1);

		} catch (IOException | WriterException e) {
			e.printStackTrace();
		}
	}

	public static void writeToOutputStream(String realName,String email,String telephone) {
		
	}
}
