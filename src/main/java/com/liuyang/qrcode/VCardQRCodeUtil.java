package com.liuyang.qrcode;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.liuyang.qrcode.model.VCard;
/**
 * 名片二维码工具类
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class VCardQRCodeUtil {
	
	/**
	 * 把名片二维码信息输出到流
	 * @param vCard
	 * @param out
	 * @throws WriterException
	 * @throws IOException
	 */
	public static void writeToStream(VCard vCard, OutputStream out) throws WriterException, IOException {
		MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
		Map<EncodeHintType, String> hints = new HashMap<>();
		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		BitMatrix bitMatrix = multiFormatWriter.encode(vCard.toVCard(), BarcodeFormat.QR_CODE, 400, 400, hints);
		MatrixToImageWriter.writeToStream(bitMatrix, "jpg", out);
	}
}
