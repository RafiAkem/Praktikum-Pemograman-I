package Praktikum_Pemrograman.Pertemuan4;

public class ListHead {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(4.5);
        list.addMiddle(3.4, 1);
        list.addHead(2.1);

        list.displayElement();
    }
}
