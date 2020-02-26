package com.nengliang.web.serviceImpl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.nengliang.web.entity.HouseXiao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring.xml")
public class HouseXiaoServiceImplTest {



	@Autowired
	private HouseXiaoServiceImpl houseXiaoServiceImpl;


	
	@Test
	public void add() {
		HouseXiao houseXiao = new HouseXiao();
		houseXiao.setXname("海3"); 
		houseXiao.setId(1010L);
		houseXiaoServiceImpl.addData(houseXiao);
		Assert.assertNotNull(houseXiao);
		
	}
	
	@Test
	public void update() {
		Long xid = 762L;
		Long id = 100L;
		String xname = "好2的";
		HouseXiao houseXiao = houseXiaoServiceImpl.updateByXid(xid, xname, id);
	}
	
	
	@Test
	public void remove() {
		Long xid = 760L;
		houseXiaoServiceImpl.removeByXid(xid);
	}
	
	
	
	
	
	public static void main(String[] args) {
		String string = "{'id':100,'xname':'公7','xid':757}";
		JSONObject jsonObject2 = JSONObject.parseObject(string);
		Long id = jsonObject2.getLong("id");
		System.out.println(id);
		Long xid = jsonObject2.getLong("xid");
		String xname = jsonObject2.getString("xname");
	}
	
}
