package com.nengliang.web.dto;

import java.io.Serializable;

public class HouseXiaoDTO implements Serializable{

	/**
	 * 返回信息
	 */
	private static final long serialVersionUID = 4835862637863579574L;
	private Long xid;
	private String xname;
	private Long id;
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
	@Override
	public String toString() {
		return "HouseXiaoDTO [xid=" + xid + ", xname=" + xname + ", id=" + id + "]";
	}
	
	
}
