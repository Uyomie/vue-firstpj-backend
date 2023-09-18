package com.example.vueadminbackend.Mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.vueadminbackend.Entity.MyProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yaml.snakeyaml.scanner.Constant;

@Mapper
public interface MyProductMapper {
    <T, E extends IPage<T>> E selectPage(E page, @Param("ew") Wrapper<T> queryWrapper);
}