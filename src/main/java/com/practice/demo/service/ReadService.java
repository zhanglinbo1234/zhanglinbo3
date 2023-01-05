package com.practice.demo.service;

import com.practice.demo.entity.Item;
import com.practice.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ReadService {
    public String displayDate(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String displayDate = simpleDateFormat.format(date);
        return displayDate;
    }

    @Autowired
    ItemRepository itemRepository;
    @Transactional(readOnly = true)
    public List<Item> findAll(){
        return itemRepository.findAll();
    }
}
