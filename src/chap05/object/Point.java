package chap05.object;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Alt + Shift + s : s
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;			// 객체 obj를 Point 타입으로 다운 캐스팅
		if(x == p.x && y == p.y)	
			return true;
		else return false;
	}
	
	
	
}