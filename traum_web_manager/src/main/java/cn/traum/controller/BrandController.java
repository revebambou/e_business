package cn.traum.controller;

import cn.traum.service.impl.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "brand"/*, produces = "text/plain;charset=utf-8"*/)
public class BrandController {

    @Reference
    private BrandService brandService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(String test){
        System.out.println("测试乱码:" +test);
        return "李狗蛋";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public void findAll(){
        System.out.println(brandService);
    }
}
