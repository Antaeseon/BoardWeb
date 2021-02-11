package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성 ");
	}

	@Override
	public void powerOn() {
		System.out.println("Power On");
	}

	@Override
	public void powerOff() {
		System.out.println("Power off");
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
