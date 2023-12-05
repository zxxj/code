public class demo2 {
    public static void main(String[] args) {

        // 练习1: 字符串拼接
        System.out.println( StringTools.concatStr('@', "hello", "world", "java")); // hello@world@java
        System.out.println(StringTools.concatStr('$')); // ""
    }
}

class StringTools {
    public static String concatStr(char separator, String ... args) {
        String str = "";

        for (int i = 0; i < args.length; i++) {
            if(i != 0) str += separator;
            str += args[i];
        }
        return str;
    }
}
