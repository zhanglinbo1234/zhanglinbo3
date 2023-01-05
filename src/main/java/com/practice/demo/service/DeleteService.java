package com.practice.demo.service;

import com.practice.demo.entity.Item;
import com.practice.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class DeleteService {
    @Autowired
    ItemRepository itemRepository;

    public Item init(int id){
        Optional<Item> item = itemRepository.findById(id);
        return item.orElse(null);
    }

    @Transactional
    public void delete(int id){
        itemRepository.deleteById(id);
    }

}
