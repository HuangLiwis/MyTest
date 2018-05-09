package com.xiaozhi.test.string;

/**
 * Created by huangzh on 2017/11/16.
 */
public class StringTest {
    public static void main(String[] args) {
        String a="java.lang.NullPointerException: text\n" +
                "\tat java.util.Objects.requireNonNull(Objects.java:228)\n" +
                "\tat java.time.format.DateTimeFormatter.parse(DateTimeFormatter.java:1848)\n" +
                "\tat java.time.LocalDate.parse(LocalDate.java:400)\n" +
                "\tat java.time.LocalDate.parse(LocalDate.java:385)\n" +
                "\tat com.facishare.open.common.model.serviceModel.OrderPayment.<init>(OrderPayment.java:50)\n" +
                "\tat com.facishare.open.service.serviceImpl.InvestServiceImpl.insertMoney(InvestServiceImpl.java:160)\n" +
                "\tat com.facishare.open.service.serviceImpl.InvestServiceImpl.invest(InvestServiceImpl.java:110)\n" +
                "\tat com.facishare.open.service.serviceImpl.InvestServiceImpl.syncData(InvestServiceImpl.java:283)\n" +
                "\tat com.facishare.open.service.serviceImpl.InvestServiceImpl.lambda$insertDB$4(InvestServiceImpl.java:266)\n" +
                "\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)\n" +
                "\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)\n" +
                "\tat java.lang.Thread.run(Thread.java:748)";

        System.out.println(a.substring(0,100));
    }
}
