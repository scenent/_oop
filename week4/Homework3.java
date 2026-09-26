import java.util.Scanner;



public class Homework3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int count = scanner.nextInt();

	// 자바에서 동적할당. new Type[N]; 에서 N은 변수일 수 있다.
        int[] numbers = new int[count];

	// 수 전부 입력받고
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

	// 최대최소 초기화
        int min = numbers[0];
        int max = numbers[0];

	// 처음꺼(초깃값) 건너뛰고 최대최소 갱신해가기
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
