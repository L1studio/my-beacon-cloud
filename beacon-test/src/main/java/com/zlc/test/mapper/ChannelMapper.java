package com.zlc.test.mapper;

import com.zlc.test.entity.Channel;
import com.zlc.test.entity.ClientBalance;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zjw
 * @description
 */
public interface ChannelMapper {

    @Select("select * from channel where is_delete = 0")
    List<Channel> findAll();

}
