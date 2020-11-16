package com.vinhblue.model.service.impl;

import com.vinhblue.model.entity.Item;
import com.vinhblue.model.repository.ItemRepository;
import com.vinhblue.model.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> findAll() {
        return this.itemRepository.findAll();
    }

    @Override
    public Item findById(Integer id) {
        return this.itemRepository.findById(id).orElse(null);
    }
}
