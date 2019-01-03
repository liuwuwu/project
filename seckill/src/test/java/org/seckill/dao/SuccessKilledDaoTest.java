package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;
    @Test
    public void insertSuccessKilled() throws Exception{
        long id=1001L;
        long phone=15207169569L;
        int insertCount=successKilledDao.insertSuccessKilled(id,phone);
        System.out.println("insertCount="+insertCount);
    }

    @Test
    public void queryByIdwithSeckill() throws Exception{
        long id=1001L;
        long phone=15207169569L;
        SuccessKilled successKilled=successKilledDao.queryByIdwithSeckill(id,phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }
}