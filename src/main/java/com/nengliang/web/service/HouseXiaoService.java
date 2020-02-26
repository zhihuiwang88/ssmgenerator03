package com.nengliang.web.service;

import java.util.List;

import com.github.pagehelper.PageRowBounds;
import com.nengliang.web.dto.HouseXiaoDTO;
import com.nengliang.web.entity.HouseXiao;
import com.nengliang.web.vo.HouseXiaoVO;
import com.nengliang.web.vo.ResultVO;

public interface HouseXiaoService {

	/**
	 * 新增数据 20200225
	 */
	HouseXiao addData(HouseXiao houseXiao);

	/**
	 * 根据XID删除数据 20200225
	 * 
	 * @return
	 */
	void removeByXid(Long xid);

	HouseXiao updateByXid(Long xid, String xname, Long id);

	List<HouseXiao> selectAll(Integer page, Integer size);

}
