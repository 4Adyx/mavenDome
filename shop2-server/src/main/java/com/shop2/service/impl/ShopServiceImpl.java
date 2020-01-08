package com.shop2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.shop2.mapper.TbDingMapper;
import com.shop2.mapper.TbShopMapper;
import com.shop2.mapper.TbUserMapper;
import com.shop2.pojo.TbDing;
import com.shop2.pojo.TbShop;
import com.shop2.pojo.TbUser;
import com.shop2.pojo.entity.Result;
import com.shop2.service.ShopService;
@Service
public class ShopServiceImpl implements ShopService {
	@Autowired
	private TbUserMapper tbUserMapper;
	@Autowired
	private TbShopMapper tbShopMapper;
	@Autowired
	private TbDingMapper tbDingMapper;

	@Override
	public TbUser findone(String username) {
		// TODO Auto-generated method stub
		return tbUserMapper.findone(username);
	}

	@Override
	public List<TbShop> findAll() {
		// TODO Auto-generated method stub
		return tbShopMapper.selectByExample(null);
	}

	@Override
	public List<TbDing> find() {
		// TODO Auto-generated method stub
		return tbDingMapper.selectByExample(null);
	}

	@Override
	public void on(Integer id) {
		// TODO Auto-generated method stub
		tbDingMapper.on(id);
	}

	@Override
	public TbShop hui(Integer id) {
		// TODO Auto-generated method stub
		return tbShopMapper.selectByPrimaryKey(id);
	}

	@Override
	public void add(TbDing tbDing) {
		// TODO Auto-generated method stub
		tbDingMapper.insert(tbDing);
	}

	@Override
	public TbUser login(TbUser tbUser) {
		// TODO Auto-generated method stub
		return tbUserMapper.login(tbUser);
	}
	
}
