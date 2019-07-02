package org.mvc.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mvc.pojo.DSkuInfo;
import org.mvc.service.DSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName: 测试类
 * @Description: TODO
 * @Author: DELL
 * @Date: 2019/7/2 10:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class DSkuServiceTest {

    @Autowired
    private DSkuService dSkuService;

    @Test
    public void findAll() {
        List<DSkuInfo> skuInfoList = dSkuService.findAll();
        for (DSkuInfo dSkuInfo : skuInfoList) {
            System.out.println(dSkuInfo);
        }
    }
}
