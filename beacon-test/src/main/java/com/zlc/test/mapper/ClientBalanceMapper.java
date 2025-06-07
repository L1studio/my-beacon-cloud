package com.zlc.test.mapper;

import com.zlc.test.entity.ClientBalance;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ClientBalanceMapper {

//    @Select("select balance from client_balance where client_id = #{clientId}")
//    Long findByClientId(@Param("clientId")Long clientId);


@Select("select * from client_balance where client_id = #{clientId}")
ClientBalance findByClientId(@Param("clientId")Long clientId);

}