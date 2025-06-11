package com.zlc.test.mapper;

import com.zlc.test.entity.MobileBlack;
import com.zlc.test.entity.MobileTransfer;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zjw
 * @description
 */
public interface MobileTransferMapper {

    @Select("select transfer_number,now_isp from mobile_transfer where is_transfer = 1 and is_delete = 0")
    List<MobileTransfer> findAll();

}
