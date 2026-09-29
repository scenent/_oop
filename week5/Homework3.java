import java.util.Scanner;

public class Homework3 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_size = 0;
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        num_size = scanner.nextInt();

        System.out.print("수를 입력하세요: ");
        int[] arr = new int[num_size];
        for (int i = 0; i < num_size; i++){
            arr[i] = scanner.nextInt();
        }

        int min_value = arr[0];
        int max_value = arr[0];
        for (int n : arr){
            if (min_value > n){
                min_value = n;
            }
            if (max_value < n){
                max_value = n;
            }
        }
        System.out.println("최대값: " + max_value);
        System.out.println("최솟값: " + min_value);
}

}