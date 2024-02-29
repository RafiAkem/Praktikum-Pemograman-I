package Praktikum_Pemrograman.Pertemuan4;

public class node {
    private double data;
    private node next;

    public node(double data) {
        this.data = data;
    }

    // Setter dan Getter
    public void setNext(node next) {
        this.next = next;
    }

    public double getdata() {
        return data;
    }

    public node getNext() {
        return next;
    }
}
