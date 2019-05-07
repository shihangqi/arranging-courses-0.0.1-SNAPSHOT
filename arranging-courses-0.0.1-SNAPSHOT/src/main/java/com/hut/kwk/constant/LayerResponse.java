package com.hut.kwk.constant;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Create by kwk on 2019-04-21
 *
 * @author kwk
 */
@Data
@AllArgsConstructor
public class LayerResponse<T> implements Serializable {
    //"code":0,"msg":"","count":1000,"data"
    private Integer code;
    private String msg;
    private Long count;
    private T data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

    
    
}
