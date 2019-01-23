package com.desperado.test.server;

import com.desperado.server.RpcService;
import com.desperado.test.api.IProductService;
import com.desperado.test.api.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
@RpcService(IProductService.class)
public class ProductServiceImpl implements IProductService {

    public void save(Product product) {
        System.out.println("产品保存成功: "+product);
    }
    public void deleteById(Long productId) {
        System.out.println("产品删除成功: "+ productId);
    }
    public void update(Product product) {
        System.out.println("产品修改成功: "+ product);
    }
    public Product get(Long productId) {
        System.out.println("产品获取成功");
        return new Product(1L,"001","笔记本电脑",BigDecimal.TEN);
    }
}
