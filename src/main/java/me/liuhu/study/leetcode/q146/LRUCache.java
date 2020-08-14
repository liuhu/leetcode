package me.liuhu.study.leetcode.q146;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146. LRU缓存机制
 * https://leetcode-cn.com/problems/lru-cache/
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/8/14
 **/
public class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
