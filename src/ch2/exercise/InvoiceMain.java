package ch2.exercise;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 청구서 데모 프로그램
 */
public class InvoiceMain {
    public static void main(String[] args) {

        Invoice myInvoice = new Invoice();

        myInvoice.addItem("my first item", 7, 100.50);
        myInvoice.addItem("my second item", 2, 400.50);

        ArrayList<Invoice.Item> arrayList = myInvoice.getInvoiceItmes();

        for(int i=0; i<arrayList.size(); i++){
            System.out.println("설명 : " + arrayList.get(i).description +
                                " , 개당 가격 : " + arrayList.get(i).unitPrice +
                                " , 수량 : " + arrayList.get(i).quantity +
                                " , 총 금액 : " + arrayList.get(i).price()
            );
        }

    }
}
