import java.util.Scanner;

int gcd_(int a, int b) {
	if (a == b) {return a;}
	else if (a > b) {return gcd_(a - b, b);}
	else {return gcd_(a, b-a);}
}

int gcd(int m, int n) {
	if (n == 0) { return m; }
	if (m < n) { return gcd(m, n % m); }
	else { return gcd(n, m % n); }
}

void main() {
	Scanner scanner = new Scanner(System.in);

	System.out.println("두 수를 입력하세요: ");
	int a = scanner.nextInt();
	int b = scanner.nextInt();

	System.out.println("두 수의 최대공약수는 " + gcd(a, b) + "입니다.");
}