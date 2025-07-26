package com.zlc.test.mapper;

import com.zlc.test.entity.ClientChannel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zjw
 * @description
 */
public interface ClientChannelMapper {

    @Select("select * from client_channel where is_delete = 0")
    List<ClientChannel> findAll();

}
