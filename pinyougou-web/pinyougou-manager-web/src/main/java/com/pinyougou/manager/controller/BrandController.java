package com.pinyougou.manager.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Brand;
import com.pinyougou.service.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    /**
     * 引用服务接口代理对象
     * timeout: 调用服务接口方法超时时间毫秒数
     */
    @Reference(timeout = 10000)
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    @PostMapping("/save")
    public boolean save(@RequestBody Brand brand) {

        try {
            brandService.save(brand);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @PostMapping("/update")
    public boolean update(@RequestBody Brand brand) {
        try {
            brandService.update(brand);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
