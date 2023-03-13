package ch06;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("move");
	}
	
	public void eating() {
		System.out.println("eating");
	}
}


class Human extends Animal{
	@Override
	public void move() {
		System.out.println("human move");
	}
	public void readBook() {
		System.out.println("human read");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("tigerMove");
	}
	public void hunting() {
		System.out.println("tigerHunting");
	}
}

class Eagle extends Animal{
	@Override // 폴리모피즘
	public void move() {
		System.out.println("eagleMove");
	}
	public void flying() {
		System.out.println("eagleFlying");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList ) {
			animal.move();
		}
		System.out.println("--end move--");
		test.testDownCasting(animalList);
	}
	
	public void testDownCasting ( ArrayList<Animal> list) { // 코드 지저분
		
		for(int i=0 ; i<list.size(); i++) {
			Animal animal = list.get(i);
			
			if( animal instanceof Human ) {
				Human human = (Human)animal ;
				human.readBook();
			}else if( animal instanceof Tiger) {
				Tiger tiger = ( Tiger)animal ;
				tiger.hunting();
			}else if( animal instanceof Eagle){
				Eagle eagle = (Eagle) animal ;
				eagle.flying() ;
			}else {
				System.out.println(" unsupported type ");
			}
			
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move(); // 클래스간 결합도 강 //상위클래스로 하위클래스 핸들링 가능
	}
}
