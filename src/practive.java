import java.util.HashMap;

public class practive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hey my name is Atul Atul";
		String[] split = input.split(" ");
		
		//Create a new HasMap
		HashMap<String, Integer> ans = new HashMap<String, Integer>();
		for(int i = 0 ; i< split.length;i++)
		{
			if(ans.containsKey(split[i]))
			{
				//get the veriable to increase and put it back
				int count = ans.get(split[i]);
				ans.replace(split[i], count+1);
			}
			else
			{
				//if not there put new
				ans.put(split[i], 1);
			}
		}
		System.out.println(ans);

	}

}
