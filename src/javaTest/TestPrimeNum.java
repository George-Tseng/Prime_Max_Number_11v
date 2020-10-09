package javaTest;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestPrimeNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            try {
                StringBuilder sb0 = new StringBuilder();
                StringBuilder sb1 = new StringBuilder();

                System.out.println("請輸入數字，輸入「exit」以離開");
                /*輸入值為int*/
                if (scan.hasNextInt()) {
                    System.out.println("輸入的數值落在int範圍內\n");
                    int num = scan.nextInt();

                    int resultI = Get_Prime_Number.getMaxPrimeNumI(sb0.append(num).toString());
                    long resultTotalI = Get_Prime_Number.getMaxPrimeNumTotalI(sb1.append(num).toString());
                    int resultNoSqrtI = Get_Prime_Number.getMaxPrimeNumNoSqrtI(sb0.toString());
                    long resultTotalNoSqrtI = Get_Prime_Number.getMaxPrimeNumTotalNoSqrtI(sb1.toString());
                    if (resultI == 0) {
                        System.out.println("輸入的值過小，因此沒有找到任何結果");
                    } else {
                        System.out.println("以int型別使用方法一得出小於等於輸入值的最大質數為：");
                        System.out.println(resultI);
                        System.out.println("以int型別使用方法一得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalI);
                        System.out.println("以int型別使用方法二得出小於等於輸入值的最大質數為：");
                        System.out.println(resultNoSqrtI);
                        System.out.println("以int型別使用方法二得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalNoSqrtI);
                    }

                    long resultL = Get_Prime_Number.getMaxPrimeNumL(sb0.toString());
                    BigDecimal resultTotalL = Get_Prime_Number.getMaxPrimeNumTotalL(sb1.toString());
                    long resultNoSqrtL = Get_Prime_Number.getMaxPrimeNumNoSqrtL(sb0.toString());
                    BigDecimal resultTotalNoSqrtL = Get_Prime_Number.getMaxPrimeNumTotalNoSqrtL(sb1.toString());
                    if (resultL == 0) {
                        System.out.println("輸入的值過小，因此沒有找到任何結果");
                    } else {
                        System.out.println("以long型別使用方法一得出小於等於輸入值的最大質數為：");
                        System.out.println(resultL);
                        System.out.println("以long型別使用方法一得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalL);
                        System.out.println("以long型別使用方法二得出小於等於輸入值的最大質數為：");
                        System.out.println(resultNoSqrtL);
                        System.out.println("以long型別使用方法二得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalNoSqrtL);
                    }

                    BigDecimal resultBD = Get_Prime_Number.getMaxPrimeNumBD(sb0.toString());
                    BigDecimal resultTotalBD = Get_Prime_Number.getMaxPrimeNumTotalBD(sb1.toString());
                    BigDecimal resultNoSqrtBD = Get_Prime_Number.getMaxPrimeNumNoSqrtBD(sb0.toString());
                    BigDecimal resultTotalNoSqrtBD = Get_Prime_Number.getMaxPrimeNumTotalNoSqrtBD(sb1.toString());
                    BigDecimal resultSqrtBD = Get_Prime_Number.getMaxPrimeNumSqrtBD(sb0.toString());
                    BigDecimal resultTotalSqrtBD  = Get_Prime_Number.getMaxPrimeNumTotalSqrtBD(sb1.toString());
                    if (resultBD.compareTo(new BigDecimal("0")) == 0) {
                        System.out.println("輸入的值過小，因此沒有找到任何結果");
                    } else {
                        System.out.println("以BigDecimal型別使用方法一得出小於等於輸入值的最大質數為：");
                        System.out.println(resultBD);
                        System.out.println("以BigDecimal型別使用方法二得出小於等於輸入值的最大質數為：");
                        System.out.println(resultTotalBD);
                        System.out.println("以BigDecimal型別使用方法一得出小於等於輸入值的質數總和為：");
                        System.out.println(resultNoSqrtBD);
                        System.out.println("以BigDecimal型別使用方法二得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalNoSqrtBD);
                        System.out.println("以BigDecimal型別使用方法三得出小於等於輸入值的最大質數為：");
                        System.out.println(resultSqrtBD);
                        System.out.println("以BigDecimal型別使用方法三得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalSqrtBD);
                        System.out.println();
                    }
                }
                /*輸入值為long*/
                else if (scan.hasNextLong()) {
                    System.out.println("輸入的數值落在long範圍內\n");
                    long num = scan.nextLong();

                    long resultL = Get_Prime_Number.getMaxPrimeNumL(sb0.append(num).toString());
                    BigDecimal resultTotalL = Get_Prime_Number.getMaxPrimeNumTotalL(sb1.append(num).toString());
                    long resultNoSqrtL = Get_Prime_Number.getMaxPrimeNumNoSqrtL(sb0.toString());
                    BigDecimal resultTotalNoSqrtL = Get_Prime_Number.getMaxPrimeNumTotalNoSqrtL(sb1.toString());
                    if (resultL == 0) {
                        System.out.println("輸入的值過小，因此沒有找到任何結果");
                    } else {
                        System.out.println("使用方法一得出小於等於輸入值的最大質數為：");
                        System.out.println(resultL);
                        System.out.println("使用方法一得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalL);
                        System.out.println("使用方法二得出小於等於輸入值的最大質數為：");
                        System.out.println(resultNoSqrtL);
                        System.out.println("使用方法二得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalNoSqrtL);
                    }

                    BigDecimal resultBD = Get_Prime_Number.getMaxPrimeNumBD(sb0.toString());
                    BigDecimal resultTotalBD = Get_Prime_Number.getMaxPrimeNumTotalBD(sb1.toString());
                    BigDecimal resultNoSqrtBD = Get_Prime_Number.getMaxPrimeNumNoSqrtBD(sb0.toString());
                    BigDecimal resultTotalNoSqrtBD = Get_Prime_Number.getMaxPrimeNumTotalNoSqrtBD(sb1.toString());
                    BigDecimal resultSqrtBD = Get_Prime_Number.getMaxPrimeNumSqrtBD(sb0.toString());
                    BigDecimal resultTotalSqrtBD  = Get_Prime_Number.getMaxPrimeNumTotalSqrtBD(sb1.toString());
                    if (resultBD.compareTo(new BigDecimal("0")) == 0) {
                        System.out.println("輸入的值過小，因此沒有找到任何結果");
                    } else {
                        System.out.println("以BigDecimal型別使用方法一得出小於等於輸入值的最大質數為：");
                        System.out.println(resultBD);
                        System.out.println("以BigDecimal型別使用方法二得出小於等於輸入值的最大質數為：");
                        System.out.println(resultTotalBD);
                        System.out.println("以BigDecimal型別使用方法一得出小於等於輸入值的質數總和為：");
                        System.out.println(resultNoSqrtBD);
                        System.out.println("以BigDecimal型別使用方法二得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalNoSqrtBD);
                        System.out.println("以BigDecimal型別使用方法三得出小於等於輸入值的最大質數為：");
                        System.out.println(resultSqrtBD);
                        System.out.println("以BigDecimal型別使用方法三得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalSqrtBD);
                        System.out.println();
                    }
                }
                /*輸入值為BigDecimal*/
                else if (scan.hasNextBigDecimal()) {
                    System.out.println("輸入的數值落在BigDecimal範圍內\n");
                    BigDecimal num = scan.nextBigDecimal();
                    BigDecimal resultBD = Get_Prime_Number.getMaxPrimeNumBD(sb0.append(num).toString());
                    BigDecimal resultTotalBD = Get_Prime_Number.getMaxPrimeNumTotalBD(sb1.append(num).toString());
                    BigDecimal resultNoSqrtBD = Get_Prime_Number.getMaxPrimeNumNoSqrtBD(sb0.toString());
                    BigDecimal resultTotalNoSqrtBD = Get_Prime_Number.getMaxPrimeNumTotalNoSqrtBD(sb1.toString());
                    BigDecimal resultSqrtBD = Get_Prime_Number.getMaxPrimeNumSqrtBD(sb0.toString());
                    BigDecimal resultTotalSqrtBD  = Get_Prime_Number.getMaxPrimeNumTotalSqrtBD(sb1.toString());
                    if (resultBD.compareTo(new BigDecimal("0")) == 0) {
                        System.out.println("輸入的值過小，因此沒有找到任何結果");
                    } else {
                        System.out.println("使用方法一得出小於等於輸入值的最大質數為：");
                        System.out.println(resultBD);
                        System.out.println("使用方法一得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalBD);
                        System.out.println("使用方法二得出小於等於輸入值的最大質數為：");
                        System.out.println(resultNoSqrtBD);
                        System.out.println("使用方法二得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalNoSqrtBD);
                        System.out.println("使用方法三得出小於等於輸入值的最大質數為：");
                        System.out.println(resultSqrtBD);
                        System.out.println("使用方法三得出小於等於輸入值的質數總和為：");
                        System.out.println(resultTotalSqrtBD);
                        System.out.println();
                    }
                } else {
                    System.out.println("沒有輸入數字");
                    String option = scan.next();
                    if (option.toUpperCase().equals("EXIT")) {
                        break;
                    }
                }
            } catch (Exception E) {
                System.out.print("發生錯誤！情況為：");
                System.out.println(E);
            }
        }

        System.out.println("\n程式已停止");
        scan.close();
    }
}
