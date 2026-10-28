class Student {
	// String hakbun = "";
	int hakbun = 0;
	String name = "";
	String major = "";
	// String phone = "";
	int phone = 0;

	Student(String a, String b, String c, String d) { 
		// hakbun = a; name = b; major = c; phone = d;
		setHakbun(a); setName(b); setMajor(c); setPhone(d);
 	}
	// void setHakbun(String value) { hakbun = value; }
	// String getHakbun() { return hakbun; }
	void setHakbun(String value) { hakbun = Integer.parseInt(value); }
	int getHakbun() { return hakbun; }
	void setName(String value) { name = value; }
	String getName() { return name; }
	void setMajor(String value) { major = value; }
	String getMajor() { return major; }
	// void setPhone(String value) { phone = value; }
	// String getPhone() { return phone; }
	void setPhone(String value) { 
		phone = Integer.parseInt(value);
	}
	String getPhone() { 
		String strPhone = '0' + Integer.toString(phone);
		return strPhone.substring(0, 3) + '-' + strPhone.substring(3, 7) + '-' + strPhone.substring(7, 11);
	}	

	void print() {
		System.out.println(hakbun + " " + name + " " + major + " " + getPhone());
	}
}

void main() {
	Scanner scanner = new Scanner(System.in);
	Student[] students = new Student[3];

	for (int i = 0; i < 3; i++) {
		System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
		String input = scanner.nextLine();

		String[] parts = input.split("\\s+");
		
		// String formattedPhone = parts[3].substring(0, 3) + "-" + parts[3].substring(3, 7) + "-" + parts[3].substring(7, 11);

		// students[i] = new Student(parts[0], parts[1], parts[2], formattedPhone);
		students[i] = new Student(parts[0], parts[1], parts[2], parts[3]);
	}

	System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
	for (int i = 0; i < 3; i++) {
		System.out.print((i+1) + "번째 학생: ");
		students[i].print();
	}
}