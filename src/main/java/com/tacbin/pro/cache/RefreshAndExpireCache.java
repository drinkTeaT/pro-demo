package com.tacbin.pro.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author EDZ
 * @description
 * @date 2020/8/6 18:07
 */
public class RefreshAndExpireCache {
    private static final int REFRESH_TIME = 10;

    private static final int EXPIRE_TIME = 20;

    LoadingCache<Long, Map<String, Long>> localCache = CacheBuilder.newBuilder()
            .expireAfterWrite(EXPIRE_TIME, TimeUnit.SECONDS)
            .refreshAfterWrite(REFRESH_TIME, TimeUnit.SECONDS)
            .build(new CacheLoader<Long, Map<String, Long>>() {
                @Override
                public Map<String, Long> load(Long key) {
                    return loadData(key);
                }
            });


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RefreshAndExpireCache expireCache =  new RefreshAndExpireCache();
        for (int i = 0; i < 10; i++) {
            expireCache.test();
        }
    }

    private void test() throws ExecutionException, InterruptedException {
        Map<String, Long> map = localCache.get(200L);

        Long value = map.get("1");
        if (Objects.isNull(value)) {
            System.out.println("出问题了");
        }
    }

    private Map<String, Long> loadData(Long key) {
        Map<String, Long> result = new HashMap<>(1024);
        result.put("1", 2L);
        return result;
    }
}
