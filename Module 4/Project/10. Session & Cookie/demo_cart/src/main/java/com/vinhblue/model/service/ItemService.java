package com.vinhblue.model.service;

import com.vinhblue.model.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> findAll();

    Item findById(Integer id);
}
