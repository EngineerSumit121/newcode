package practice;

public class Duplicates {

	public static void main(String[] args) {
		
		
		int a[]= {1,3,3,3,5,7,9};
		
		  int count=0;
		  
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++)
			  {
				  if(a[i]==a[j])
				  {
					  count++;
				  }
			  }
			  
		  }
		  System.out.println("Duplicate number: "+count);
		  

	}

}
