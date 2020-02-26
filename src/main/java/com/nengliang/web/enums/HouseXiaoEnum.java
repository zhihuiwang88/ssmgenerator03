package com.nengliang.web.enums;

public enum HouseXiaoEnum {

	
	SUCCEED(200,"成功"),
	ADD_ERROR(100,"新增失败"),
	UPDATE_ERROR(101,"更新失败"),
	REMOVE_ERROR(102,"刪除失败"),
	HOUSEXIAO_ERROR(103,"参数异常"),
	HOUSEXIAO_XID_ERROR(104,"XID为空"),
	SELECT_PAGE_ERROR(105,"数据分页失败"),
	XID_EXIT_ERROR(106,"Xid存在,新增失败"),
	;
	
	
	
	private Integer code;
	private String message;
	
	HouseXiaoEnum(Integer code,String message) {
		this.code = code;
		this.message = message;
	}


	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	 
}
