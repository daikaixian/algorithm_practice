package org.water.practice.gohigher.concurrent;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by water on 9/26/17.
 */
public class CopyOnWriteMap<K, V> implements Map<K, V>, Cloneable {

  final transient ReentrantLock lock = new ReentrantLock();

  private volatile Map<K, V> internalMap;


  public CopyOnWriteMap () {
    this.internalMap = new HashMap<K, V>();
  }

  @Override
  public V put(K key, V value) {

    //只有写的时候需要加锁,读的时候不加锁.所以效率有提升.
    lock.lock();
    try {
      Map<K, V> map = new HashMap<>(internalMap);
      map.put(key, value);
      this.internalMap = map;
      return value;
    } finally {
      lock.unlock();
    }
  }

  @Override
  public V get(Object key) {
    return internalMap.get(key);
  }

  @Override
  public void putAll(Map<? extends K, ? extends V> m) {

    lock.lock();
    try {
      Map<K,V> map = new HashMap<>(m);
      map.putAll(internalMap);
      internalMap = map;
    }finally {
      lock.unlock();
    }

  }


  @Override
  public int size() {
    return 0;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }

  @Override
  public boolean containsKey(Object key) {
    return false;
  }

  @Override
  public boolean containsValue(Object value) {
    return false;
  }




  @Override
  public V remove(Object key) {
    return null;
  }



  @Override
  public void clear() {

  }

  @Override
  public Set<K> keySet() {
    return null;
  }

  @Override
  public Collection<V> values() {
    return null;
  }

  @Override
  public Set<Entry<K, V>> entrySet() {
    return null;
  }

  @Override
  public V getOrDefault(Object key, V defaultValue) {
    return null;
  }

  @Override
  public void forEach(BiConsumer<? super K, ? super V> action) {

  }

  @Override
  public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {

  }

  @Override
  public V putIfAbsent(K key, V value) {
    return null;
  }

  @Override
  public boolean remove(Object key, Object value) {
    return false;
  }

  @Override
  public boolean replace(K key, V oldValue, V newValue) {
    return false;
  }

  @Override
  public V replace(K key, V value) {
    return null;
  }

  @Override
  public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
    return null;
  }

  @Override
  public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
    return null;
  }

  @Override
  public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
    return null;
  }

  @Override
  public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
    return null;
  }
}
