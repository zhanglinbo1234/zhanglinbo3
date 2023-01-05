package com.practice.demo.service;

import com.practice.demo.entity.Item;
import com.practice.demo.form.ItemUpdateForm;
import com.practice.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
    @Autowired
    ItemRepository itemRepository;

    public void update(ItemUpdateForm itemUpdateForm){
        Item item = new Item();
        item.setId(itemUpdateForm.getId());
        item.setName(itemUpdateForm.getName());
        int price = Integer.parseInt(itemUpdateForm.getPrice());
        item.setPrice(price);
        itemRepository.save(item);
    }
}
