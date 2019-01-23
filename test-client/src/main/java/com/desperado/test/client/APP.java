package com.desperado.test.client;

import com.desperado.client.RpcProxy;
import com.desperado.test.api.IProductService;
import com.desperado.test.api.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application.xml")
public class APP {
    @Autowired
    private RpcProxy rpcProxy;
    private IProductService productService;
    @Before
    public void init() {
        productService = rpcProxy.getInstance(IProductService.class);
    }
    @Test
    public void testSave() throws Exception {
        productService.save(new Product(2L,"002","内衣",BigDecimal.TEN));
    }
    @Test
    public void testDelete() throws Exception {
        productService.deleteById(2L);
    }    @Test
    public void testUpdate() throws Exception {
        productService.update(new Product(2L,"002","内衣",BigDecimal.ONE));
    }
    @Test
    public void testGet() throws Exception {
        Product product = productService.get(1L);
        System.out.println("获取到的产品信息为:"+product);
    }
}
