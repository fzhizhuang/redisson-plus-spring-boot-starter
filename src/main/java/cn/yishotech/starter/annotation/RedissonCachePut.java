/**
 * 项目名称:  redisson-plus-spring-boot-starter
 * 公司名称:  YiShoTech
 * All rights Reserved, Designed By YiShoTech 2023-2024
 */
package cn.yishotech.starter.annotation;

import cn.yishotech.starter.model.DataType;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * <p>类路径:cn.yishotech.starter.annotation.RedissonCache</p>
 * <p>类描述:Redisson缓存存储注解</p>
 * <p>创建人:jason zong</p>
 * <p>创建时间:2024/10/05 19:29</p>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RedissonCachePut {

    /**
     * 缓存key前缀
     */
    String prefix() default "";

    /**
     * 缓存键
     */
    String key() default "";

    /**
     * 缓存数据类型
     */
    DataType type() default DataType.DEFAULT;

    /**
     * 缓存超时时间
     */
    long timeout() default 0;

    /**
     * 时间单位
     */
    TimeUnit timeUnit() default TimeUnit.MINUTES;

}
