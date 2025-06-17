import java.util.*;
import java.io.*;
class StudentManage{
	public static void main(String[] args){
		HashMap<Integer,String> hms=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		hms.put(101,"abcd");
		hms.put(102,"bdge");
		hms.put(103,"dwbcb");
		//System.out.println(hms);
		
		//finding a id from hashmap.
		System.out.println("enter id to search:");
		int id1=sc.nextInt();
		System.out.println("contains id:"+hms.containsKey(id1));
		System.out.println("the searched id is:"+hms.get(id1));
		
		//removing an id from hashmap.
		System.out.println("enter id to remove:");
		int id2=sc.nextInt();
		hms.remove(id2);
		System.out.println(hms);
		sc.nextLine();
		
		//writing into a file.
		String name;
		try{
		BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
		int rn=10;
		for(int i=1;i<=5;i++){
			System.out.println("Enter student "+i+" name:");
			name=sc.nextLine();
			bw.write(name);
			System.out.println();
			
		}
		bw.close();
		//reading from a file.
		BufferedReader br=new BufferedReader(new FileReader("book.txt"));
		String li;
		while((li=br.readLine())!=null){
			System.out.println(li);
		}
		br.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
}	
