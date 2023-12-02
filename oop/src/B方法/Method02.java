package B方法;

public class Method02 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,2,3};
        int[] arr3 = {4,5};
        MethodTest m = new MethodTest();
        m.mapArr(arr);
        m.mapArr(arr2);
        m.mapArr(arr3);
    }
}

class MethodTest {
    public void mapArr(int[] map) {
        for (int i = 0; i < map.length; i++) {
            System.out.println(map[i]);
        }
    }
}
