package com.shop2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shop2.pojo.TbDing;
import com.shop2.pojo.TbShop;
import com.shop2.pojo.TbUser;
import com.shop2.pojo.entity.Result;
import com.shop2.service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopController {
	@Reference
	private ShopService shopService;
//	@Autowired
//	private RedisTemplate redisTemplate;
	@RequestMapping("/findAll")
	public List<TbShop> findAll(){
//		List<TbShop> list=null;
//		
//		list=redisTemplate.boundListOps("list").range(0, -1);
//		if(list==null){
//			redisTemplate.boundListOps("list").leftPush(list1);
//		}
		return shopService.findAll();
	}
	@RequestMapping("/find")
	public List<TbDing> find(){
		return shopService.find();
	}
	@RequestMapping("/on")
	public Result on(Integer id){
		shopService.on(id);
		return new Result(true,"");
	}
	@RequestMapping("/hui")
	public TbShop hui(Integer id){
		return shopService.hui(id);
	}
	@RequestMapping("/add")
	public Result add(@RequestBody TbDing tbDing){
		tbDing.setFh(0);
		shopService.add(tbDing);
		return new Result(true,"");
	}
	@RequestMapping("/login")
	public Result login(@RequestBody TbUser tbUser){
		TbUser login=shopService.login(tbUser);
		if(tbUser!=null){
			if(tbUser.getJs()==1){
				return new Result(true,"欢迎商家登录");
			}else{
				return new Result(false,"欢迎用户登录");
			}
		}
		return new Result(false,"登陆失败");
	}
}
