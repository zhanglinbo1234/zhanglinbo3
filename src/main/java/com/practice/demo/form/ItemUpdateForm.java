package com.practice.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ItemUpdateForm {
    private int id;
    @NotBlank(message = "商品名は必要です。")
    @Size(max = 50 , message = "45文字以内で入力してください。")
    private String name;
    @NotBlank(message = "値段は必要です。")
    @Size(max = 10 , message = "10桁以内で入力してください。")
    @Pattern(regexp = "^[0-9]*$", message = "値段は半角数字で入力してください。")
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public ItemUpdateForm(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ItemUpdateForm() {
    }

    @Override
    public String toString() {
        return "ItemUpdateForm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
