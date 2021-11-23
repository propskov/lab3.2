package Twolist;

public class Main {
    public static void main(String[] args) {
        Twolist lst = new Twolist();
        lst.addFront(1);
        lst.addFront(0);
        lst.addBack(2);
        lst.addBack(3);
        lst.addBack(4);
        lst.printAll();

        System.out.println();
        System.out.println("Печать в обратном порядке:");

        System.out.println("добавление всех значений массива в начало списка:");
        lst.addalltoHead(new int[]{-5,-4, -3,-2,-1});
        lst.printAll();
        System.out.println();


        System.out.println("добавление всех значений массива в конец списка:");
        lst.addalltoBack(new int[]{5, 6,7,8});
        System.out.println();






        lst.del(12);//Удаление значения которого нет в массиве
        lst.printAll();
        System.out.println();


    }
}
