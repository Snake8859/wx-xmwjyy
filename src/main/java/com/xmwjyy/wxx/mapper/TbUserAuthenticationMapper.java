package com.xmwjyy.wxx.mapper;

import com.xmwjyy.wxx.pojo.TbUserAuthentication;
import com.xmwjyy.wxx.pojo.TbUserAuthenticationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserAuthenticationMapper {
    int countByExample(TbUserAuthenticationExample example);

    int deleteByExample(TbUserAuthenticationExample example);

    int deleteByPrimaryKey(String uaid);

    int insert(TbUserAuthentication record);

    int insertSelective(TbUserAuthentication record);

    List<TbUserAuthentication> selectByExample(TbUserAuthenticationExample example);

    TbUserAuthentication selectByPrimaryKey(String uaid);

    int updateByExampleSelective(@Param("record") TbUserAuthentication record, @Param("example") TbUserAuthenticationExample example);

    int updateByExample(@Param("record") TbUserAuthentication record, @Param("example") TbUserAuthenticationExample example);

    int updateByPrimaryKeySelective(TbUserAuthentication record);

    int updateByPrimaryKey(TbUserAuthentication record);
}