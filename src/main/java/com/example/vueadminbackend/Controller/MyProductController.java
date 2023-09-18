package com.example.vueadminbackend.Controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.example.vueadminbackend.Service.MyProductService;
import com.example.vueadminbackend.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.vueadminbackend.Entity.MyProduct;

@RestController
@RequestMapping("/my/product")
@CrossOrigin
public class MyProductController {

    @Autowired
    private MyProductService MyProductService;
    @RequestMapping("/all")
    public Result getAll(@RequestParam(defaultValue = "1") int pageNum){
        Page<MyProduct> page=new Page<>(pageNum, 10);

        Page<MyProduct> MyProduct=new MyProductService().findAll(page);
        System.out.println(MyProduct);
        return Result.ok().data("items",MyProduct);

    }
}
