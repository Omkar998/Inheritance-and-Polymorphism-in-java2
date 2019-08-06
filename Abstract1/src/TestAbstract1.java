public class TestAbstract1 {
	public static void main(String[] args) {
		Instruments arr[]=new Instruments[10];
		
		for(int i=0;i<10;i++)
		{
			if(i==1 || i==3 || i==5)
				arr[i]=new Piano();
			else if(i==2 || i==4 || i==6)
				arr[i]=new Flute();
			else 
				arr[i]=new Guitar();
		}
	}
	public static void display(Instruments arr[]){
		for(Instruments i:arr){
			if(i instanceof Piano)
				i.play();
			if(i instanceof Flute)
				i.play();
			if(i instanceof Guitar)
				i.play();
		}

	}



}


