package org.mvc.web;

import org.mvc.pojo.DSkuInfo;
import org.mvc.service.DSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: 商品信息Controller
 * @Description: TODO
 * @Author: DELL
 * @Date: 2019/7/2 13:26
 */
@Controller
@RequestMapping("/sku")
public class DSkuController {

    @Autowired
    private DSkuService skuService;

    @RequestMapping("/all")
    @ResponseBody
    public List<DSkuInfo> findAll() {
        List<DSkuInfo> skuInfoList = skuService.findAll();
        return skuInfoList.subList(0,9);
    }
}
