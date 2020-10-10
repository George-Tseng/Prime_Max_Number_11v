package javaTest;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.ParseException;

public class Get_Prime_Number {

    protected static int getMaxPrimeNumI(String input) throws ParseException {
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        int inputNum, result = 0;

        try{
            inputNum = Integer.parseInt(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    int stopNum = (int)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status < ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以int型別找最大質數方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static int getMaxPrimeNumI(int input) throws ParseException {
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        int inputNum, result = 0;

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    int stopNum = (int)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status < ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以int型別找最大質數方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static long getMaxPrimeNumTotalI(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        int inputNum;
        long result = 0;

        try{
            inputNum = Integer.parseInt(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    int stopNum = (int)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result += i;
                        }
                    }
                    else if(i == 2){
                        if(status < ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以int型別找質數總和方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static long getMaxPrimeNumTotalI(int input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        int inputNum;
        long result = 0;

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    int stopNum = (int)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result += i;
                        }
                    }
                    else if(i == 2){
                        if(status < ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以int型別找質數總和方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static long getMaxPrimeNumL(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        long inputNum, result = 0;

        try{
            inputNum = Long.parseLong(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    long stopNum = (long)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status < (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以long型別找最大質數方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static long getMaxPrimeNumL(long input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        long inputNum, result = 0;

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    long stopNum = (long)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status < (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以long型別找最大質數方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalL(String input) throws ParseException {
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        long inputNum;
        BigDecimal result = new BigDecimal("0");

        try{
            inputNum = Long.parseLong(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    long stopNum = (long)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result = result.add(new BigDecimal(i));
                        }
                    }
                    else if(i == 2){
                        if(status < (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result = result.add(new BigDecimal(i));
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以long型別找質數總和方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }
    protected static BigDecimal getMaxPrimeNumTotalL(long input) throws ParseException {
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        long inputNum;
        BigDecimal result = new BigDecimal("0");

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    long stopNum = (long)Math.ceil(Math.sqrt(i));
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j <= stopNum; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result = result.add(new BigDecimal(i));
                        }
                    }
                    else if(i == 2){
                        if(status < (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result = result.add(new BigDecimal(i));
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以long型別找質數總和方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumBD(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = new BigDecimal(input);
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    BigDecimal stopNum = getMidtermNumBD(i);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = i;
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = i;
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找最大質數方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumBD(BigDecimal input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    BigDecimal stopNum = getMidtermNumBD(i);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = i;
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = i;
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找最大質數方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalBD(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = new BigDecimal(input);
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    BigDecimal stopNum = getMidtermNumBD(i);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = result.add(i);
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = result.add(i);
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找質數總和方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalBD(BigDecimal input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    BigDecimal stopNum = getMidtermNumBD(i);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = result.add(i);
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = result.add(i);
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找質數總和方法一已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static int getMaxPrimeNumNoSqrtI(String input) throws ParseException {
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        int inputNum, result = 0;

        try{
            inputNum = Integer.parseInt(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j < i; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status < ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以int型別找最大質數方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static int getMaxPrimeNumNoSqrtI(int input) throws ParseException {
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        int inputNum, result = 0;

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j < i; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status < ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以int型別找最大質數方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static long getMaxPrimeNumTotalNoSqrtI(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        int inputNum;
        long result = 0;

        try{
            inputNum = Integer.parseInt(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j < i; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result += i;
                        }
                    }
                    else if(i == 2){
                        if(status < ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以int型別找質數總和方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static long getMaxPrimeNumTotalNoSqrtI(int input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        int inputNum;
        long result = 0;

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(int i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(int j = 2; j < i; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < ((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (i * 100) / inputNum;
                            result += i;
                        }
                    }
                    else if(i == 2){
                        if(status < ((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ ((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (i * 100) / inputNum;
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以int型別找質數總和方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static long getMaxPrimeNumNoSqrtL(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        long inputNum, result = 0;

        try{
            inputNum = Long.parseLong(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j < i; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status < (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以long型別找最大質數方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static long getMaxPrimeNumNoSqrtL(long input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        long inputNum, result = 0;

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j < i; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result = i;
                        }
                    }
                    else if(i == 2){
                        if(status < (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result = i;
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = 0;
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以long型別找最大質數方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalNoSqrtL(String input) throws ParseException {
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        long inputNum;
        BigDecimal result = new BigDecimal("0");

        try{
            inputNum = Long.parseLong(input);
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j < i; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result = result.add(new BigDecimal(i));
                        }
                    }
                    else if(i == 2){
                        if(status < (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result = result.add(new BigDecimal(i));
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以long型別找質數總和方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalNoSqrtL(long input) throws ParseException {
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        long inputNum;
        BigDecimal result = new BigDecimal("0");

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum >= 2){
                int status = 0;
                for(long i = 2; i <= inputNum; i++){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*2以外，只有奇數有可能是質數*/
                    if(i % 2 == 1){
                        for(long j = 2; j < i; j++){
                            if(i % j == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            if(status < (int)((i * 100) / inputNum)){
                                System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                            }
                            status = (int)((i * 100) / inputNum);
                            result = result.add(new BigDecimal(i));
                        }
                    }
                    else if(i == 2){
                        if(status < (int)((i * 100) / inputNum)){
                            System.out.println("已執行完 "+ (int)((i * 100) / inputNum) + "% 的範圍");
                        }
                        status = (int)((i * 100) / inputNum);
                        result = result.add(new BigDecimal(i));
                    }
                }
            }
        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }
        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以long型別找質數總和方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumNoSqrtBD(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = new BigDecimal(input);
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(i) < 0; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = i;
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = i;
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找最大質數方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumNoSqrtBD(BigDecimal input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(i) < 0; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = i;
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = i;
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找最大質數方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalNoSqrtBD(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = new BigDecimal(input);
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(i) < 0; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = result.add(i);
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = result.add(i);
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找質數總和方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalNoSqrtBD(BigDecimal input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(i) < 0; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = result.add(i);
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = result.add(i);
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找質數總和方法二已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumSqrtBD(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = new BigDecimal(input);
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    /* MathContext mc->表精確值，0完全正確，這邊開1
                     * 開0遇到java.lang.ArithmeticException: Computed square root not exact.
                     * BigDecimal.sqrt(mc)->求出平方根
                     * BigDecimal.setScale(進位到幾位小數, RoundingMode.模式，RoundingMode.CEILING ＝ Math.ceil(其他型別) */
                    MathContext mc = new MathContext(1);
                    BigDecimal stopNum = i.sqrt(mc).setScale(0, RoundingMode.CEILING);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = i;
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = i;
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找最大質數方法三已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumSqrtBD(BigDecimal input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    /* MathContext mc->表精確值，0完全正確，這邊開1
                     * 開0遇到java.lang.ArithmeticException: Computed square root not exact.
                     * BigDecimal.sqrt(mc)->求出平方根
                     * BigDecimal.setScale(進位到幾位小數, RoundingMode.模式，RoundingMode.CEILING ＝ Math.ceil(其他型別) */
                    MathContext mc = new MathContext(1);
                    BigDecimal stopNum = i.sqrt(mc).setScale(0, RoundingMode.CEILING);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = i;
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = i;
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找最大質數方法三已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalSqrtBD(String input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = new BigDecimal(input);
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    /* MathContext mc->表精確值，0完全正確，這邊開1
                     * 開0遇到java.lang.ArithmeticException: Computed square root not exact.
                     * BigDecimal.sqrt(mc)->求出平方根
                     * BigDecimal.setScale(進位到幾位小數, RoundingMode.模式，RoundingMode.CEILING ＝ Math.ceil(其他型別) */
                    MathContext mc = new MathContext(1);
                    BigDecimal stopNum = i.sqrt(mc).setScale(0, RoundingMode.CEILING);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = result.add(i);
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = result.add(i);
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找質數總和方法三已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMaxPrimeNumTotalSqrtBD(BigDecimal input) throws ParseException{
        /*計時用*/
        String timeStart = Get_Date.getDateNow();
        String timeEnd;
        /*參數*/
        BigDecimal inputNum, result = new BigDecimal("0");

        try{
            inputNum = input;
            /*最小質數為2*/
            if(inputNum.compareTo(new BigDecimal("2")) >= 1){
                BigDecimal status = new BigDecimal("0");
                for(BigDecimal i = new BigDecimal("2") ; i.compareTo(inputNum) < 1 ; i = i.add(new BigDecimal("1"))){
                    /*boolean的設定要放入第一層才能不斷再生*/
                    boolean rightNumber = true;
                    /*因數最大值時為平方根*/
                    /* MathContext mc->表精確值，0完全正確，這邊開1
                     * 開0遇到java.lang.ArithmeticException: Computed square root not exact.
                     * BigDecimal.sqrt(mc)->求出平方根
                     * BigDecimal.setScale(進位到幾位小數, RoundingMode.模式，RoundingMode.CEILING ＝ Math.ceil(其他型別) */
                    MathContext mc = new MathContext(1);
                    BigDecimal stopNum = i.sqrt(mc).setScale(0, RoundingMode.CEILING);
                    /* 2以外，只有奇數有可能是質數 */
                    /* BigDecimal的商、餘數
                     * 商：BigDecimal1.divideAndRemainder(BigDecimal2)[0]
                     * 餘：BigDecimal1.divideAndRemainder(BigDecimal2)[1] */
                    if(i.divideAndRemainder(new BigDecimal("2"))[1].compareTo(new BigDecimal("1")) == 0){
                        for(BigDecimal j = new BigDecimal("2"); j.compareTo(stopNum) < 1; j = j.add(new BigDecimal("1"))){
                            if(i.divideAndRemainder(j)[1].compareTo(new BigDecimal("0")) == 0){
                                rightNumber = false;
                                break;
                            }
                        }
                        /*質數時的行為*/
                        if(rightNumber){
                            BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                            BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                            if(status.compareTo(paraTmp) < 0){
                                System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                            }
                            status = paraTmp;
                            result = result.add(i);
                        }
                    }
                    else if(i.compareTo(new BigDecimal("2")) == 0){
                        BigDecimal paraTmpResult = i.multiply(new BigDecimal("100"));
                        BigDecimal paraTmp = paraTmpResult.divideAndRemainder(inputNum)[0];
                        if(status.compareTo(paraTmp) < 0){
                            System.out.println("已執行完 "+ paraTmp + "% 的範圍");
                        }
                        status = paraTmp;
                        result = result.add(i);
                    }
                }
            }

        } catch(NumberFormatException NFE){
            result = new BigDecimal("0");
        }

        timeEnd = Get_Date.getDateNow();
        System.out.print("\n以BigDecimal型別找質數總和方法三已完成，");
        System.out.println(Get_Date.getTimeDifference(timeStart, timeEnd)+"\n");
        return result;
    }

    protected static BigDecimal getMidtermNumBD(BigDecimal numBD){
        /* 初值：i = 0->BigDecimal i = new BigDecimal("0")
         * 停止條件：i < numBD->i.compareTo(numBD) < 0，小於-1、等於0、大於1
         * 遞迴條件：i++->i = i.add(new BigDecimal("1")) */
        BigDecimal result = new BigDecimal("0");
        /*平方根為整數時*/
        for(BigDecimal i = new BigDecimal("0") ; i.compareTo(numBD) < 1 ; i = i.add(new BigDecimal("1"))){
            BigDecimal goal = i.multiply(i);
            if(goal.compareTo(numBD) == 0){
                result = i;
                break;
            }
        }
        /*平方根非整數時*/
        if(result.compareTo(new BigDecimal("0")) == 0){
            for(BigDecimal i = new BigDecimal("0") ; i.compareTo(numBD) < 1 ; i = i.add(new BigDecimal("1"))){
                BigDecimal goal = i.multiply(i);
                BigDecimal goalNew = i.add(new BigDecimal("1")).multiply(i.add(new BigDecimal("1")));
                if(goal.compareTo(numBD) < 0 && goalNew.compareTo(numBD) > 0){
                    result = i.add(new BigDecimal("1"));
                    break;
                }
            }
        }
        return result;
    }
}
