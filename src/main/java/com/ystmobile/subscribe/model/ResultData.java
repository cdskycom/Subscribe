package com.ystmobile.subscribe.model;

public class ResultData {
	private int result;
	private String message;
	private Object data;
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public static int SUBSCRIBED = 1;
	public static int SUCCESS = 0;
	public static String SUBSCRIBEDMESSAGE = "您已经成功预约，无需再次预约";	
	public static String SUCCESSMESSAGE = "您已经成功预约!";	
	public static int OTHER = 2;
	public static String OTHERDMESSAGE = "出现错误了！";	
}
