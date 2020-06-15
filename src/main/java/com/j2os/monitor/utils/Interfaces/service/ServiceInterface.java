package com.j2os.monitor.utils.Interfaces.service;

import org.springframework.data.domain.Pageable;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface ServiceInterface<T> {
    T add(T t);
    T update(T t) throws InvocationTargetException, IllegalAccessException;
    List<T> findAll();
    List<T> delete(T t);
    T findOne(T t);
    T findById(long id);
    List<T> findAllPageable(Pageable pageable);
}
