package org.mvc.service.impl;

import org.mvc.dao.DSkuInfoMapper;
import org.mvc.pojo.DSkuInfo;
import org.mvc.pojo.DSkuInfoExample;
import org.mvc.service.DSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: 商品信息服务实现类
 * @Description: TODO
 * @Author: DELL
 * @Date: 2019/7/2 9:44
 */
@Service
public class DSkuServiceImpl implements DSkuService {

    @Autowired
    private DSkuInfoMapper dSkuInfoMapper;

    /*public void setdSkuInfoMapper(DSkuInfoMapper dSkuInfoMapper) {
        this.dSkuInfoMapper = dSkuInfoMapper;
    }*/

    @Override
    public List<DSkuInfo> findAll() {
        DSkuInfoExample example = new DSkuInfoExample();
        example.createCriteria().andIdIsNotNull();
        List<DSkuInfo> skuInfoList = dSkuInfoMapper.selectByExample(example);
        return skuInfoList;
    }
}
