package Praktikum_Pemrograman.Pertemuan3;

public class StrukturList {
    private node HEAD;
    
    //cek apakah linked list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }
    
    //fungsi menambahkan data di depan
    public void addTail(int data) {
        node newnode = new node(data);
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            node curNode = HEAD;
            node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newnode);
        }
    }

    // menampilkan isi linked list
    public void displayElement() {
        node curNode = HEAD;

        while(curNode != null) {
            System.out.println(curNode.getdata()+ " ");
            curNode = curNode.getNext();
        }
    }
}