package Twolist;

public class Twolist {
    public static class ListElement {
        Integer data;
        ListElement next;
        ListElement prev;

        public ListElement(Integer data) {
            this.data = data;
        }

        boolean checkValue(Integer data) {
            return data == null && this.data == null || data != null && data.equals(this.data);
        }
    }

    private ListElement head;
    private ListElement tail;

    //Добавить спереди
    void addFront(Integer data) {
        ListElement a = new ListElement(data);
        a.data = data;   //инициализируем данные
        if (head == null)
            tail = head = a;
        else {
            a.next = head;
            head.prev = a;
            head = a;

        }
    }

    public Integer peakFront() {
        return head != null ? head.data : null;
    }

    void del(Integer data) {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail;
            head = null;
            tail = null;
            System.out.println("Список стал пуст");
            return;
        }
        if (data.equals(head.data)) {
            head = head.next;
            return;
        }
        ListElement t = head;
        while (t.next != null) {
            if (t.next.data.equals(data)) {
                if (tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }

    void addBack(Integer data) {
        ListElement a = new ListElement(data);
        a.data = data;
        if (head == null) {
            head = a;
            a.prev = tail;
        } else tail.next = a;
        tail = a;
    }

    public Integer peakBack() {
        return tail != null ? tail.data : null;
    }

    public boolean contains(Integer data) {
        ListElement it = head;
        while (it != null) {
            if (it.checkValue(data))
                return true;
            it = it.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;


    }

    public void addalltoHead(int[] data) {
        int h = data.length;
        while (h > 0) {
            addFront(data[h - 1]);
            h--;
        }
    }

    public void addalltoBack(int[] data) {
        for (int datum : data) {
            addBack(datum);
        }
    }

    public void printAll() {
        ListElement it = head;
        while (it != null) {
            System.out.println(it.data);
            it = it.next;
        }
    }




}