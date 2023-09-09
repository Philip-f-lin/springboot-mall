package com.linphilip.springbootmall.constant;

public class MyTest {
    public static void main(String[] args) {
        ProductCategory category = ProductCategory.FOOD;
        // 把Enum的值轉換成String
        String s = category.name();
        System.out.println(s); // FOOD

        // 根據字串搜尋到他對應的是哪個Enum的固定值
        String s2 = "CAR";
        ProductCategory category2 = ProductCategory.valueOf(s2); // 有找到就存在category2中
        System.out.println(category2); // CAR
    }
}
