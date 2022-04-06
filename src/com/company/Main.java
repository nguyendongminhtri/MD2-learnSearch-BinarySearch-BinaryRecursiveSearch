package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }
        System.out.println("list --> "+integerList);
//        Collections.sort(integerList);
        //TÌM KIẾM TUYẾN TÍNH (linear Search)
        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();
        System.out.println("check " +linearSearch(integerList,search));
        long startTime1 = System.nanoTime();
        if(linearSearch(integerList,search)==-1){
            System.out.println("Not found");
        } else {
            System.out.println("At index : "+linearSearch(integerList,search));
        }
        long endTime1 = System.nanoTime();
        System.out.println("qua --> "+(endTime1-startTime1));


//        System.out.println("================================BINARY SEARCH=========================================");
//        long startTime2 = System.nanoTime();
//        if(binarySearch(integerList,search)==-1){
//            System.out.println("Not found");
//        } else {
//            System.out.println("At index : "+binarySearch(integerList,search));
//        }
//        long endTime2 = System.nanoTime();
//        System.out.println("Trôi qua --> "+(endTime2-startTime2));


//        System.out.println("===============================BINARY RECURSIVE SEARCH===========================================");
//        long startTime3 = System.nanoTime();
//        if(binaryRecursiveSearch(integerList,0,integerList.size()-1,search)==-1){
//            System.out.println("Not found");
//        } else {
//            System.out.println("At index : "+binaryRecursiveSearch(integerList,0, integerList.size()-1,search));
//        }
//        long endTime3 = System.nanoTime();
//        System.out.println("Trôi qua --> "+(endTime3-startTime3));
    }

    //linear Search
    public static int linearSearch(List<Integer> integers, int search){
        System.out.println("size" + integers.size());
        for (int i = 0; i < integers.size(); i++) {
            if(search == integers.get(i)){
                return i;
            }

        }
        return -1;
    }

    //binary search
//    public static int binarySearch(List<Integer> integers, int search){
//        int start = 0;
//        int end = integers.size()-1;
//        while (end>=start){
//            int center = (end+start)/2;
//            if(search<integers.get(center)){
//                end = center-1;
//            } else if(search==integers.get(center)){
//                return center;
//            } else {
//                start = center+1;
//            }
//        }
//        return -1;
//    }

    //Binary Recursive Search
//    public static int binaryRecursiveSearch(List<Integer> integers, int low, int high, int value) {
//        if (high>=low) {
//            int mid = low + (high - low)/2;
//            if (integers.get(mid) == value){
//                return mid;
//            }
//            if (integers.get(mid) > value){
//                return binaryRecursiveSearch(integers, low, mid-1, value);
//            }
//            return binaryRecursiveSearch(integers, mid+1, high, value);
//        }
//        return -1;
//    }

}
