package com.base;

import java.util.Map;

public class RequestData {

	private Map<String, Object> reqHead;

	private Map<String, Object> reqBody;

	public RequestData() {

	}

	public Map<String, Object> getReqHead() {
		return reqHead;
	}

	public void setReqHead(Map<String, Object> reqHead) {
		this.reqHead = reqHead;
	}

	public Map<String, Object> getReqBody() {
		return reqBody;
	}

	public void setReqBody(Map<String, Object> reqBody) {
		this.reqBody = reqBody;
	}

	public Object getData(String key) {
		return this.reqBody.get(key);
	}

	public Map<String, Object> getDataMap() {
		return this.reqBody;
	}

	@Override
	public String toString() {
		return "RequestData [reqHead=" + reqHead + ", reqBody=" + reqBody + "]";
	}

}
