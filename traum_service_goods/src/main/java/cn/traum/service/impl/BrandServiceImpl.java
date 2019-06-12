package cn.traum.service.impl;

import cn.traum.dao.BrandMapper;
import cn.traum.pojo.Brand;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {
        List<Brand> brandList = brandMapper.selectAll();
        return brandList;
    }
}
