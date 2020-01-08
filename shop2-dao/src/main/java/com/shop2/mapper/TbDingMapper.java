package com.shop2.mapper;

import com.shop2.pojo.TbDing;
import com.shop2.pojo.TbDingExample;
import com.shop2.pojo.entity.Result;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface TbDingMapper {
    int countByExample(TbDingExample example);

    int deleteByExample(TbDingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbDing record);

    int insertSelective(TbDing record);

    List<TbDing> selectByExample(TbDingExample example);

    TbDing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbDing record, @Param("example") TbDingExample example);

    int updateByExample(@Param("record") TbDing record, @Param("example") TbDingExample example);

    int updateByPrimaryKeySelective(TbDing record);

    int updateByPrimaryKey(TbDing record);
    @Update(value="update tb_ding set fh=1 where id=#{id}")
	void on(Integer id); 
//    @Update(value="update tb_ding set fh=1 ssum=sum-#{ssum} where id=#{id}")
//    void on(Integer id);
}