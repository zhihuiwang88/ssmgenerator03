package com.nengliang.web.exception;

import com.nengliang.web.enums.HouseXiaoEnum;

public class HouseXiaoException extends RuntimeException{

	private Integer code;
	
	public HouseXiaoException(HouseXiaoEnum houseXiaoEnum) {
	    super(houseXiaoEnum.getMessage());
	    this.code = houseXiaoEnum.getCode();
	}

	public Integer getCode() {
		return code;
	}
	
	
	
	
}
