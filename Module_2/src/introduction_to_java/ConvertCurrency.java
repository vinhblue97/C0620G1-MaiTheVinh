package introduction_to_java;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        float vnd, usd;
        int currencyType;
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn loại tiền bạn muốn đổi:\n" +
                "1. Việt Nam đồng (VNĐ)\n" +
                "2. USD");
        currencyType = sc.nextInt();
        switch (currencyType) {
            case 1:
                System.out.println("Nhập số tiền bạn muốn chuyển");
                vnd = sc.nextFloat();
                usd = vnd / 23177.5f;
                System.out.println("Số tiền sau khi chuyển là $" + Math.round(usd*100));
                break;
            case 2:
                System.out.println("Nhập số tiền bạn muốn chuyển đổi");
                usd = sc.nextFloat();
                vnd = (float) usd * 23177.5f;
                System.out.println("Số tiền sau khi chuyển là " + Math.round(vnd*100) + " đồng");
        }
    }
}

