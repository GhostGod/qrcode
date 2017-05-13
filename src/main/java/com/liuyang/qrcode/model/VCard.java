package com.liuyang.qrcode.model;

import java.io.Serializable;

import org.springframework.util.StringUtils;

/**
 * 名片
 * @author liuyang
 * @email y_liu@hiersun.com | 745089707@qq.com
 */
public class VCard implements Serializable {
	private static final long serialVersionUID = 5412258364767944256L;
	/** 姓名 */
	private String realName;
	/** 职位 */
	private String title;
	/** 电子邮箱 */
	private String email;
	/** 固定电话 */
	private String telephone;
	/** 移动电话 */
	private String mobilephone;
	/** 公司地址 */
	private String companyAddress;
	/** 公司名称 */
	private String companyName;
	/** 主页网址 */
	private String url;
	/** 备注 */
	private String remark;

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 转换为VCARD格式
	 * @return
	 */
	public String toVCardString() {
		//BEGIN:VCARD\nVERSION:3.0\nFN:金山\nEMAIL:yxzh73@163.com\nTEL:13581992503\nTEL;CELL:13581992504\nADR;TYPE=WORK:北京朝阳区\nORG:恒信\nTITLE:工程师\nURL:oohdear.com\nNOTE:测试\nEND:VCARD
		StringBuffer sb = new StringBuffer("BEGIN:VCARD\nVERSION:3.0\n");
		if (StringUtils.hasText(realName)) {
			sb.append("FN:").append(realName).append("\n");
		}
		if (StringUtils.hasText(title)) {
			sb.append("TITLE:").append(title).append("\n");
		}
		if (StringUtils.hasText(email)) {
			sb.append("EMAIL:").append(email).append("\n");
		}
		if (StringUtils.hasText(telephone)) {
			sb.append("TEL:").append(telephone).append("\n");
		}
		if (StringUtils.hasText(mobilephone)) {
			sb.append("TEL;CELL:").append(mobilephone).append("\n");
		}
		if (StringUtils.hasText(companyAddress)) {
			sb.append("ADR;TYPE=WORK:").append(companyAddress).append("\n");
		}
		if (StringUtils.hasText(companyName)) {
			sb.append("ORG:").append(companyName).append("\n");
		}
		if (StringUtils.hasText(url)) {
			sb.append("URL:").append(url).append("\n");
		}
		if (StringUtils.hasText(remark)) {
			sb.append("NOTE:").append(remark).append("\n");
		}
		sb.append("END:VCARD");
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Vcard [realName=" + realName + ", title=" + title + ", email=" + email + ", telephone=" + telephone + ", mobilephone="
				+ mobilephone + ", companyAddress=" + companyAddress + ", companyName=" + companyName + ", url=" + url + ", remark="
				+ remark + "]";
	}

}
