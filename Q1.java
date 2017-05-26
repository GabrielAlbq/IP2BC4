
public class Q1 {

	public static void main(String[] args) {
		int i=0,j;
		char c = '*';
		char b = ' ';
		for(i=0;i<10;i++){
			for(j=i;j<10;j++)
			{
			System.out.print(c);
			}
			System.out.println();
		}
		
		for(i=10;i>=0;i--){
			for(j=i;j<10;j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		
		
		for(i=10;i>=0;i--){
			for(j=i;j<10;j++){
				System.out.print(b);
			}
			System.out.println(c);
		}

	}

}
