package test.test02;

public class Circle {

	int radius;
	
	// 원의 넓이
	double calwidth() {
        double area = 3.14 * radius * radius;
        return area;
    }
	
	// 원의 둘
	double calwidthdol() {
		return 3.14 * radius * 2;
	}
	
	// 원의 넓이의 갯
	double calgat(int count) {
		return calwidth() * count;
	}
}
