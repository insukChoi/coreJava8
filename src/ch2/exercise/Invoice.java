package ch2.exercise;

import java.util.ArrayList;

/**
 * 2.6.1 정적 중첩 클래스의 Invoice 클래스를 완전히 구현하라. 청구서를 출력하는 메서드와 샘플 청구서를 만들어 출력하는
 * 데모 프로그램을 제공하라.
 */
public class Invoice {
    public static class Item {
        String description;
        int quantity;
        double unitPrice;

        double price(){
            return quantity * unitPrice;
        }
    }

    // 청구서 Items
    private ArrayList<Item> items = new ArrayList<>();

    // Item 추가 메서드
    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    // 청구서 출력 메서드
    public ArrayList getInvoiceItmes(){
        return items;
    }

}
