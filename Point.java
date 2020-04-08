class Point {
	String id
	double x,y;

	//TODO add new variable
	String color;
	

	//TODO constructor
	public Point(String id,String color, double x, double y) {
		this.id = id;
		this.color = color;
		this.x = x;
		this.y = y;
	}

	//TODO setters and getters
	public String getId() {
		return this.id;
	}

	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y();
	}
	public String getColor() {
		return this.color
	}
	
	public String setId(String id) {
		this.id = id;
	}
	
	public int setX(int x) {
		this.x = x;
	}
	public int setY(int y) {
		this.y = y;
	}
	
	public String setColor(String color) {
		this.color = color;
	}
	public void move (char xDirection, char yDirection) {
		//TODO
		xDirection = x + 1;
		yDirection = y + 1;
	}

	public void draw () {
		//TODO
		System.out.println(xDirection);
		System.out.println(yDirection);
	}



}