package org.mvc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mvc.pojo.DSkuInfo;
import org.mvc.pojo.DSkuInfoExample;

public interface DSkuInfoMapper {
    int countByExample(DSkuInfoExample example);

    int deleteByExample(DSkuInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DSkuInfo record);

    int insertSelective(DSkuInfo record);

    List<DSkuInfo> selectByExampleWithBLOBs(DSkuInfoExample example);

    List<DSkuInfo> selectByExample(DSkuInfoExample example);

    DSkuInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DSkuInfo record, @Param("example") DSkuInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") DSkuInfo record, @Param("example") DSkuInfoExample example);

    int updateByExample(@Param("record") DSkuInfo record, @Param("example") DSkuInfoExample example);

    int updateByPrimaryKeySelective(DSkuInfo record);

    int updateByPrimaryKeyWithBLOBs(DSkuInfo record);

    int updateByPrimaryKey(DSkuInfo record);
}