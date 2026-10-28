int gcd(int m, int n) {
	if (n==0) return m;
	if (m > n) return gcd(n, m % n);
	else return gcd(m, n % m);
}

int gcd2(int a, int b) {
	int tmp = 0;
	// 큰 수가 앞으로
	if (a < b) {
		tmp = a;
		a = b;
		b = tmp;
	}
	// b가 0이될때까지 반복문, b가 0이면 a가 gcd.
	while (b != 0) {
		tmp = a % b;
		a = b;
		b = tmp;
	}
	return a;
}