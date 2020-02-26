package com.nengliang.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nengliang.web.entity.HouseXiao;
import com.nengliang.web.entity.HouseXiaoPage;
import com.nengliang.web.enums.HouseXiaoEnum;
import com.nengliang.web.exception.HouseXiaoException;
import com.nengliang.web.service.HouseXiaoService;
import com.nengliang.web.util.ResultVOUtil;
import com.nengliang.web.vo.ResultVO;



/**
 * 20200226
 * @author Dell
 *
 */
@Controller
@RequestMapping("/houseXiao")
public class HouseXiaoController {

	@Autowired
	private HouseXiaoService houseXiaoService;

	private static final Logger logger = Logger.getLogger(HouseXiaoController.class);

	/**
	 * localhost:8081/ssmgenerator/houseXiao/save 
	 * houseXiao控制器
	 * @param houseXiaoVO
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public ResultVO insertData(@RequestParam(value = "xname", required = false) String xname,
			@RequestParam(value = "id", required = false) Long id) {

		HouseXiao houseXiao = new HouseXiao();
		houseXiao.setXname(xname);
		houseXiao.setId(id);
		try {
			houseXiaoService.addData(houseXiao);
		} catch (Exception e) {
			logger.error(HouseXiaoEnum.ADD_ERROR.getMessage());
			logger.info(HouseXiaoEnum.ADD_ERROR.getMessage());
			return ResultVOUtil.error(HouseXiaoEnum.ADD_ERROR.getCode(), HouseXiaoEnum.ADD_ERROR.getMessage());
		}
		return ResultVOUtil.succeed(houseXiao);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public ResultVO insertData(@RequestBody HouseXiao houseXiao) {
		try {
			houseXiaoService.addData(houseXiao);
		} catch (Exception e) {
			logger.error(HouseXiaoEnum.ADD_ERROR.getMessage());
			return ResultVOUtil.error(HouseXiaoEnum.ADD_ERROR.getCode(), HouseXiaoEnum.ADD_ERROR.getMessage());
		}
		return ResultVOUtil.succeed(houseXiao);
	}
	
	
	
	// 更新数据1
	@PostMapping(value = "/update")
	@ResponseBody
	public ResultVO updateByXid(@RequestBody HouseXiao house) {

		HouseXiao houseXiao = null;
		try {
			houseXiao = houseXiaoService.updateByXid(house.getXid(), house.getXname(), house.getId());
		} catch (HouseXiaoException exception) {
			return ResultVOUtil.error(HouseXiaoEnum.UPDATE_ERROR.getCode(), HouseXiaoEnum.UPDATE_ERROR.getMessage());
		}

		return ResultVOUtil.succeed();
	}

	// 更新数据2
	@PostMapping(value = "/updatesByXid")
	@ResponseBody
	public ResultVO updateByXid(@RequestParam(value = "xid", required = false) Long xid,
			@RequestParam(value = "xname", required = false) String xname,
			@RequestParam(value = "id", required = false) Long id) {

		HouseXiao houseXiao = null;
		try {
			houseXiao = houseXiaoService.updateByXid(xid, xname, id);
		} catch (HouseXiaoException exception) {
			return ResultVOUtil.error(HouseXiaoEnum.UPDATE_ERROR.getCode(), HouseXiaoEnum.UPDATE_ERROR.getMessage());
		}

		return ResultVOUtil.succeed();
	}

	@GetMapping("/remove")
	@ResponseBody
	public ResultVO remove(@RequestParam("xid") Long xid) {
		try {
			houseXiaoService.removeByXid(xid);
		} catch (Exception e) {
			return ResultVOUtil.error(HouseXiaoEnum.REMOVE_ERROR.getCode(), HouseXiaoEnum.REMOVE_ERROR.getMessage());
		}
		return ResultVOUtil.succeed();
	}

	/**
	 * 分页数据
	 * 
	 * @param page,第几页
	 * @param size，每页几条数据
	 * @return
	 */
	@GetMapping("/selectPage")
	@ResponseBody
	public ResultVO selectPage(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "size", defaultValue = "20") Integer size) {

		HouseXiaoPage houseXiaoPage = new HouseXiaoPage();
		try {
			List<HouseXiao> houseXiaoList = houseXiaoService.selectAll((page - 1), size);
			houseXiaoPage.setPage(page);
			houseXiaoPage.setSize(size);
			houseXiaoPage.setHouseXiaoList(houseXiaoList);
		} catch (Exception e) {
			return ResultVOUtil.error(HouseXiaoEnum.SELECT_PAGE_ERROR.getCode(),
					HouseXiaoEnum.SELECT_PAGE_ERROR.getMessage());
		}
		return ResultVOUtil.succeed(houseXiaoPage);
	}

}
