package com.nengliang.web.entity;

import java.util.List;

public class HouseXiaoPage {

	private Integer page;
	private Integer size;
	private Long total;
	List<HouseXiao> houseXiaoList;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<HouseXiao> getHouseXiaoList() {
		return houseXiaoList;
	}
	public void setHouseXiaoList(List<HouseXiao> houseXiaoList) {
		this.houseXiaoList = houseXiaoList;
	}
	@Override
	public String toString() {
		return "HouseXiaoPage [page=" + page + ", size=" + size + ", total=" + total + ", houseXiaoList="
				+ houseXiaoList + "]";
	}

	
}
