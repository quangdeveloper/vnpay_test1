package vn.vnpay.jdbcoracle.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import vn.vnpay.jdbcoracle.util.GsonUtil;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    public void setKey(String key, Object value) {
        redisTemplate.opsForValue().set(key, GsonUtil.toJson(value));
    }

    public Object getKey(String key) {
        if (!redisTemplate.hasKey(key)) {
            System.out.println("key not exists!");
            return "";
        } else {
            return redisTemplate.opsForValue().get(key);
        }
    }
    public boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }
}
