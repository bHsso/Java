package ch22;

class Bank{ // Bank : sharedResource __동기화가 필요한 메서드에 synchronized(동기화) 처리
	private int money = 10000;
	
	public void saveMoney(int save) { //sharedResource를 하나의 스레드가 가지게 되면 다른 스레드는 기다리는 상태(:block 상태)가 됨
				     //sync를 걸 resource 지정 
		//synchronized (this) { // synchronized 방법 1.
			int m = getMoney() ;
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m + save);
		//}
		
	}
	// synchronized 방법2 . 
	public void minusMoney(int minus) {
		int m = getMoney() ;
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney () {
		return money;
	}
}



class Park extends Thread {
	
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println( "saveMoney: "+ SyncMain.myBank.getMoney());
	}
}

class ParkWife extends Thread {
	
	public void run() {
		// synchronized block 방식 
		synchronized (SyncMain.myBank) { // sync를 걸 리소스 : SyncMain.myBank
			System.out.println("start minus");
			SyncMain.myBank.minusMoney(1000);
			System.out.println( "minusMoney: "+ SyncMain.myBank.getMoney());
		}
		
	}
}

public class SyncMain {

	public static Bank myBank = new Bank();

	public static void main(String[] args) {
		Park p = new Park();
		ParkWife pw = new ParkWife();
		pw.start();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	// 입,출금의 순서 상관 없이 입금 또는 출금의 operation이 진행되는 동안 sharedResource가 rock이 걸려서 sharedResource 값을 더럽히지 않아 오류가 발생하지 않는다.
	
}
