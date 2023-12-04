package B方法;

public class Method08 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        Test7 t = new Test7();
        t.map(arr);

        for(int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]); // arr[0] === 100
        }
    }
}

class Test7 {
    public void map(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            arr[0] = 100;
            System.out.println(arr[i]);
        }
    }
}
