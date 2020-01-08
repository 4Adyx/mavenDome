package com.shop2.service;

import java.util.List;

import com.shop2.pojo.TbDing;
import com.shop2.pojo.TbShop;
import com.shop2.pojo.TbUser;
import com.shop2.pojo.entity.Result;

public interface ShopService {

	TbUser findone(String username);

	List<TbShop> findAll();

	List<TbDing> find();

	void on(Integer id);

	TbShop hui(Integer id);

	void add(TbDing tbDing);

	TbUser login(TbUser tbUser);

}
