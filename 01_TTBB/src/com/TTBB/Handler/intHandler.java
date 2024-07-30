package com.TTBB.Handler;

import java.util.InputMismatchException;
import java.util.Scanner;

public class intHandler {

    public static int safeInt() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        // 提示用户输入一个整数


        while (true) {
            try {
                // 尝试读取整数
                number = readInteger(scanner);
                break; // 成功读取整数，退出循环
            } catch (InputMismatchException e) {
                // 捕获输入不匹配异常
                System.out.println("Invalid input, please try again.");
                // 清除错误输入
                scanner.next(); // 清除当前无效输入
            }
        }
        return number;
    }

    public static int readInteger(Scanner scanner) throws InputMismatchException {
        return scanner.nextInt();
    }
}

