package com.yuziyan.comsumer;

/**
 * @Author wangzhenyu06
 * @Date 2021/9/8 7:09 下午
 * @Desc
 */
public class ThreadJoin {
    public static void main(String[] args) {
        // 新建线程
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " i = " + i);
            }
        }, "生当作人杰");

        // 启动线程
        thread.start();

        // 使用join()
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("======主线程即将执行结束======");
    }
}
