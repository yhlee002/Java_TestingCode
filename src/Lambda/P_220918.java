package Lambda;

import java.util.Arrays;

public class P_220918 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.setAll(arr, (i) -> (int)(Math.random() * 5 + 1));
    }
}

@FunctionalInterface // Compiler check functional interface
interface FunctionalInterfaceEx {
    void run();
}

class LambdaEx1 {

    static void execute (FunctionalInterfaceEx f) {
        f.run();
    }

    static FunctionalInterfaceEx getFunctionalInterface() {
        FunctionalInterfaceEx f = () -> System.out.println("f3.run()");
        return f; // 참조변수에 람다식을 넣어 반환
    }

    public static void main(String[] args) {
        FunctionalInterfaceEx f1 = () -> System.out.println("f1.run()"); // 직접 람다식을 참조변수에 넣음(해당 람다식을 참조하는 타입을 가짐)

        FunctionalInterfaceEx f2 = new FunctionalInterfaceEx() { // 직접 람다식을 구현(익명함수이므로 생성자로 생성과 동시에 abstract method override 필요)
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        FunctionalInterfaceEx f3 = getFunctionalInterface(); // 람다식을 참조하는 함수형 인터페이스를 반환
        System.out.println("--------------------------------------------");
        f1.run();
        f2.run();
        f3.run();

        System.out.println("--------------------------------------------");
        execute(f1);

        System.out.println("--------------------------------------------");
        execute(() -> System.out.println("run()"));
    }
}