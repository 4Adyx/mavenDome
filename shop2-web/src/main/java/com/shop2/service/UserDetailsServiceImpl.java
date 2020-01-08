package com.shop2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.support.ManagedArray;
import org.springframework.core.SimpleAliasRegistry;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.authority.mapping.GrantedAuthoritiesMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.shop2.pojo.TbUser;
import com.shop2.service.ShopService;

public class UserDetailsServiceImpl implements UserDetailsService {
	private ShopService shopService;
	
	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<GrantedAuthority> arrayList = new ArrayList<GrantedAuthority>();
		arrayList.add(new SimpleGrantedAuthority("ROLE_GOODS"));
		TbUser tbuser=shopService.findone(username);
		if(tbuser!=null){
			return new User(username, tbuser.getPassword(), arrayList);
		}
		return null;
	}

}
