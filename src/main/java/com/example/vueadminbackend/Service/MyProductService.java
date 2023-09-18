package com.example.vueadminbackend.Service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.vueadminbackend.Entity.MyProduct;
import com.example.vueadminbackend.Mapper.MyProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyProductService {

    @Autowired
    private MyProductMapper myProductMapper;
    public Page<MyProduct> findAll(Page<MyProduct> page) {
        return myProductMapper.selectPage(page, null);
    }
}
