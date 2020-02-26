package com.nengliang.web.util;

import com.nengliang.web.enums.HouseXiaoEnum;
import com.nengliang.web.vo.HouseXiaoVO;
import com.nengliang.web.vo.ResultVO;

/**
 * 返回成功和失败信息
 * 
 * @author Dell 20200225
 * @param <T>
 */
public class ResultVOUtil<T> {

	/**
	 * 返回成功信息什么也不提醒
	 * 
	 * @return
	 */
	public static ResultVO succeed() {
		return succeed(null);
	}

	/**
	 * 返回成功信息
	 * 
	 * @return
	 */
	public static ResultVO succeed(Object object) {
		ResultVO resultVO = new ResultVO();
		resultVO.setCode(HouseXiaoEnum.SUCCEED.getCode());
		resultVO.setMsg(HouseXiaoEnum.SUCCEED.getMessage());
		resultVO.setData(object);
		return resultVO;
	}

	/**
	 * 返回失败信息
	 */
	public static ResultVO error(Integer code, String msg) {
		ResultVO resultVO = new ResultVO();
		resultVO.setCode(code);
		resultVO.setMsg(msg);
		return resultVO;

	}



	
}
