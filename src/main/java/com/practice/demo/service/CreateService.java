package com.practice.demo.service;

import com.practice.demo.entity.Item;
import com.practice.demo.form.ItemCreateForm;
import com.practice.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateService {
    @Autowired
    ItemRepository itemRepository;
    public void create(ItemCreateForm itemCreateForm){
        Item item = new Item();
        item.setName(itemCreateForm.getName());
        int price = Integer.parseInt(itemCreateForm.getPrice());
        item.setPrice(price);
        itemRepository.save(item);
    }

}
