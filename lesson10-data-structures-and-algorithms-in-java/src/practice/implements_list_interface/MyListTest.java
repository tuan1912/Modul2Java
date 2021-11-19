package practice.implements_list_interface;

public class MyListTest {
        public static void main(String[] args) {
                MyList<Integer> list = new MyList<>();
                list.add(10);
                list.add(11);
                list.add(12);
                list.add(13);
                list.add(14);
                list.add(15);
                list.addWithIndex(9,99);
                list.show();
        }

}
