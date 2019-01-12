package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     * 更新记录影响的行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据id查询秒杀对象
     * @param seckillId
     * @return
     */
   Seckill queryById(long seckillId);

    /**
     * 根据偏移量秒杀对象
     * @param offet
     * @param limit
     * @return
     */
   List<Seckill> queryAll(@Param("offset") int offet, @Param("limit") int limit);
}
