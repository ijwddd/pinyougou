package com.pinyougou.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Seller;
import com.pinyougou.service.SellerService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Reference(timeout = 10000)
    private SellerService sellerService;

    /**
     * 添加商家
     * @param seller
     * @return
     */
    @RequestMapping("/save")
    public boolean save(@RequestBody Seller seller) {
        try {
            sellerService.save(seller);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}