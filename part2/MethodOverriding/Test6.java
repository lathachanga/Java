class Phone{
	int displaySize;
	int ram;
	double price;
	Phone(int d, int r,double p){
		displaySize=d;
		ram=r;
		price=p;
	}
	void display(){
		System.out.println("Displaysize="+displaySize);
		System.out.println("ram="+ram);
		System.out.println("price="+price);
	}
}
class CameraPhone extends Phone{
	int pixels;
	CameraPhone(int d, int r,double p,int px){
		super(d,r,p);
		pixels=px;
	}
	void display(){
	    super.display();
		System.out.println("Pixels="+pixels+"Mega pixels");
	}
}
class Test6{
	public static void main(String args[]){
		CameraPhone cp=new CameraPhone(6,4,2500,64);
	}
}