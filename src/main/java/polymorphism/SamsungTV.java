package polymorphism;


public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리...");
	}
	
	public void dt() {
		System.out.println("객체 삭제 전에 처리할 로직 처리...");
	}
	
	
	 public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	 
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker 호출!!");
		this.speaker = speaker;
	}	

	public void setPrice(int price) {
		System.out.println("===> setPrice 호출!!");
		this.price = price;
	}
	

	@Override
	public void powerOn() {
		System.out.println("Samsung TV----전원켠다. (가격 : "+price+")");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung TV---전원 끈다.");
		
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
