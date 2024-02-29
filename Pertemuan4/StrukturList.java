package Praktikum_Pemrograman.Pertemuan4;

public class StrukturList {
    private node HEAD;
    
    //cek apakah linked list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }
    
    //fungsi menambahkan data AddHead List
    public void addHead(double data) {
        node newnode = new node(data);
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            newnode.setNext(HEAD);
            HEAD = newnode;
        }
    }
    
    //fungsi menambahkan data di depan
    public void addTail(double data) {
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

    //fungsi menambahkan data di tengah
    public void addMiddle(double data, int pos) {
        node newnode = new node(data);
        node curNode = HEAD;
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            node posNode = null;
            if (pos == 1) {
                newnode.setNext(HEAD);
                HEAD = newnode;
            } else {
                int i = 1;
                while (curNode != null && i < pos) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newnode);
                newnode.setNext(curNode);
            }
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