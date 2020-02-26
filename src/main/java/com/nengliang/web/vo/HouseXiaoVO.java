package com.nengliang.web.vo;

import java.io.Serializable;

/**
 * 接受前端传的参数
 * @author Dell
 *20200225
 */
public class HouseXiaoVO implements Serializable{



	private static final long serialVersionUID = -7301433116195824233L;
	
	/**
	 * @param xid,派出所小类ID
	 * @param xname,小类名称
	 * @param id,大类ID
	 * @param pageNum,分页从第几页开始，默认第一页开始
	 * @param pageSize,每页显示几条数据，默认每页显示10条数据
	 * @param pageTotal,总页数
	 */
	
	private Long xid;
	private String xname;
	private Long id;
	private Integer pageNum;
	private Integer pageSize;
    private Integer pageTotal;
	public Long getXid() {
		return xid;
	}
	public void setXid(Long xid) {
		this.xid = xid;
	}
	public String getXname() {
		return xname;
	}
	public void setXname(String xname) {
		this.xname = xname;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageTotal() {
		return pageTotal;
	}
	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}
	@Override
	public String toString() {
		return "HouseXiaoVO [xid=" + xid + ", xname=" + xname + ", id=" + id + ", pageNum=" + pageNum + ", pageSize="
				+ pageSize + ", pageTotal=" + pageTotal + "]";
	}
    
    
}
