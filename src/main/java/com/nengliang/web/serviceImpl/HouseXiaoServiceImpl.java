package com.nengliang.web.serviceImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nengliang.web.dao.HouseXiaoMapper;
import com.nengliang.web.entity.HouseXiao;
import com.nengliang.web.enums.HouseXiaoEnum;
import com.nengliang.web.exception.HouseXiaoException;
import com.nengliang.web.service.HouseXiaoService;

@Service
public class HouseXiaoServiceImpl implements HouseXiaoService {

	/**
	 * HouseXiao实现类 20200225
	 */
	private static final Logger logger = Logger.getLogger(HouseXiaoServiceImpl.class);

	@Autowired
	private HouseXiaoMapper houseXiaoMapper;

	/**
	 * 新增数据
	 */
	public HouseXiao addData(HouseXiao houseXiao) {

		HouseXiao house = houseXiaoMapper.selectByPrimaryKey(houseXiao.getXid());
		if (house == null) {
			houseXiaoMapper.insert(houseXiao);
		} else {
			throw new HouseXiaoException(HouseXiaoEnum.XID_EXIT_ERROR);
		}
		return houseXiao;
	}

	/**
	 * 刪除ID
	 */
	public void removeByXid(Long xid) {
		// 判断xid
		if (xid != null) {
			houseXiaoMapper.deleteByPrimaryKey(xid);
		} else {
			throw new HouseXiaoException(HouseXiaoEnum.HOUSEXIAO_XID_ERROR);
		}

	}

	/**
	 * 修改ID
	 */
	public HouseXiao updateByXid(Long xid, String xname, Long id) {
		HouseXiao houseXiao = new HouseXiao();
		// 判断xid不为空进行操作
		if (xid != null) {
			houseXiao.setXid(xid);
			houseXiao.setXname(xname);
			houseXiao.setId(id);
			houseXiaoMapper.updateByPrimaryKey(houseXiao);
		} else {
			System.out.println("----" + HouseXiaoEnum.HOUSEXIAO_XID_ERROR.getMessage());
			throw new HouseXiaoException(HouseXiaoEnum.HOUSEXIAO_XID_ERROR);
		}

		return houseXiao;
	}

	/**
	 * 分页信息
	 */
	public List<HouseXiao> selectAll(Integer page, Integer size) {

		List<HouseXiao> houseXiaoList = houseXiaoMapper.selectPage(page, size);
		return houseXiaoList;
	}

}
