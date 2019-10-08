package com.xmwjyy.wxx.pojo;
/**
 * 自定义数据接收对象
 * @author snake8859
 *
 */
public class CustomData {

	private String message;
	
	private String key;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "CustomData [message=" + message + ", key=" + key + "]";
	}
	
	
	
}
