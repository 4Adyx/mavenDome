package com.shop2.mapper;

import com.shop2.pojo.TbUser;
import com.shop2.pojo.TbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TbUserMapper {
    int countByExample(TbUserExample example);

    int deleteByExample(TbUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
    @Select(value="select * from tb_user where username=#{username}")
	TbUser findone(@Param("username")String username);
    @Select(value="select * from tb_user where username=#{username} and password=#{password}")
	TbUser login(TbUser tbUser);
}