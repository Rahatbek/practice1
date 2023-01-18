package com.rahatbek.mytest.multithreads.alekseivladykin.concurr.demo4;

public class Demo4 {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(0);

        new DepositThread(account).start();

        System.out.println("Calling waitAndWithdraw()...");

        account.waitAndWithdraw(50_000_000);

        System.out.println("waitAndWithdraw() finished");
    }

    private static class WithdrawThread extends Thread {

        private final Account account;

        private WithdrawThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20_000; ++i) {
                account.withdraw(1);
            }
        }
    }

    private static class DepositThread extends Thread {

        private final Account account;

        private DepositThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50_000_000; ++i) {
                account.deposit(1);
            }
        }
    }
}
