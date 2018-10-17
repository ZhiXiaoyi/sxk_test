package com.sxk.test;

import org.junit.Test;

import java.util.Arrays;

public class test_01 {
    @Test
    public void testOne() {
        Integer[] srcIntegers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] destIntegers = new Integer[5];
        System.arraycopy(srcIntegers, 1 + 1, srcIntegers, 1, 7);
        srcIntegers[8] = null;
        System.out.print(Arrays.toString(srcIntegers));
    }

    public void sort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i] < arrays[j]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[i];
                    arrays[i] = temp;
                    System.out.println(Arrays.toString(arrays));
                }
            }
        }
    }

    int[] arrays = {12, 49, 9, 67, 455};

    @Test
    public void test_02() {
        sort(arrays);
    }

    public int maxSubSum(int[] a) {
        int maxSum = 0;
        int tempSum = 0;
        for (int i = 0; i < a.length; i++) {
            if (tempSum > 0) {
                tempSum += a[i];
            } else {
                tempSum = a[i];
                System.out.println("重新开始累加的值：" + a[i]);
            }

            if (maxSum < tempSum) {
                maxSum = tempSum;
                System.out.println("交换的值：" + a[i]);
            }
        }
        return maxSum;
    }

    @Test
    public void testMaxSubSum() {
        int[] a = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(maxSubSum(a));
    }

    @Test
    public void test() {
        int[][] num = new int[100][100];
        int n = 4;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = count++;
            }
        }
        myOutPut(num, 0, n - 1);
    }

    public void output(int[][] num, int start, int end) {
        if (start >= end || end <= 0) return;
        for (int i = start; i <= end; i++) {
            System.out.println(num[start][i]);
        }
        for (int i = start + 1; i <= end; i++) {
            System.out.println(num[i][end]);
        }
        for (int i = end - 1; i >= start; i--) {
            System.out.println(num[end][i]);
        }
        for (int i = end - 1; i > start; i--) {
            System.out.println(num[i][start]);
        }
        output(num, start + 1, end - 1);
    }

    public void myOutPut(int[][] num,int start,int end){
        if (start >= end || end <= 0) return;
        for(int i=start;i<end;i++){
            System.out.println(num[start][i]);
        }
        for(int i=start;i<end;i++){
            System.out.println(num[i][end]);
        }
        for(int i=end;i>start;i--){
            System.out.println(num[end][i]);
        }
        for(int i=end;i>start;i--){
            System.out.println(num[i][start]);
        }
        myOutPut(num,start+1,end-1);
    }

    public void test_05(){
        System.out.println("hello git");
    }
    @Test
    public void test_03(){
        String stringArray1="ABCDEFGHI";
        String stringArray2="JKLMNOPQR";
        String stringArray3="STUVWXYZ*";

        int m=3;
        int d=8;
        String str="HAPPY";

        String[] strArray=str.split("");
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].equals(" ")){
                getIndex(m,d,"*");
            }else {
                getIndex(m,d,strArray[i]);
            }
        }
    }

    public void getIndex(int m,int d,String chart){
        String stringArray1="ABCDEFGHI";
        String stringArray2="JKLMNOPQR";
        String stringArray3="STUVWXYZ*";
        if(stringArray1.indexOf(chart)>=0){
            int x=1;
            int y=stringArray1.indexOf(chart)+1;
            int moveOfX=(m-1)%3;
            int moveOfY=(d-1)%9;
            x=x-moveOfX;
            if(x<=0){
                x=x+3;
            }
            y=y-moveOfY;
            if(y<=0){
                y=y+9;
            }
            System.out.println(x+""+y);
        }if(stringArray2.indexOf(chart)>=0){
            int x=2;
            int y=stringArray1.indexOf(chart)+1;
            int moveOfX=(m-1)%3;
            int moveOfY=(d-1)%9;
            x=x-moveOfX;
            if(x<=0){
                x=x+3;
            }
            y=y-moveOfY;
            if(y<=0){
                y=y+9;
            }
            System.out.println(x+""+y);
        }if(stringArray2.indexOf(chart)>=0){
            int x=3;
            int y=stringArray1.indexOf(chart)+1;
            int moveOfX=(m-1)%3;
            int moveOfY=(d-1)%9;
            x=x-moveOfX;
            if(x<=0){
                x=x+3;
            }
            y=y-moveOfY;
            if(y<=0){
                y=y+9;
            }
            System.out.println(x+""+y);
        }
        //...其他同理
    }

    public void test_04(int[] arrays,int maxPrice){
        for(int i=0;i<arrays.length;i++){
            for(int j=0;j<i;i++){

            }
        }
    }


}


