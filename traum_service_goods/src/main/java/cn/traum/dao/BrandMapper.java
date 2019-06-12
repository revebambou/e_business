package cn.traum.dao;

import cn.traum.pojo.Brand;
import tk.mybatis.mapper.common.Mapper;

public interface BrandMapper extends Mapper<Brand> {
    //base select mysql is existed when extending the Mapper class
}
