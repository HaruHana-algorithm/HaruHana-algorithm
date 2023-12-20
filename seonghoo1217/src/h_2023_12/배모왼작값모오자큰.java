package h_2023_12;

public class 배모왼작값모오자큰 {
    public static void main(String[] args) {
        int [] arr = {5, 1, 4, 3, 2, 6, 10, 7, 9};
        int n = arr.length;
        int i = find(arr, n);
        System.out.println(i);
    }

    static int find(int [] arr, int n){
        for (int i=0; i< arr.length;i++){
            if (isLeft(arr, i) && isRight(arr, i)){
                return i;
            }
        }
        return -1;
    }

    public static boolean isLeft(int [] arr, int index){
        int target = arr[index];
        for (int i=0;i<index;i++){
            if (arr[i] == target) continue;
            if (arr[i]>target) return false;
        }
        return true;
    }

    public static boolean isRight(int [] arr, int index){
        int target = arr[index];
        for (int i=index;i<arr.length;i++){
            if (arr[i] == target) continue;
            if (target>arr[i]) return false;
        }
        return true;
    }
}
