package com.lara;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicates
{
	public static void main(String[] args)
	{
		String[] str = {"ram", "Yogi", "Raju", "Yogi", "ram", "Raju", "Ram", "ram"};
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (String s : str)
		{
			if (map.containsKey(s))
			{
				map.put(s, map.get(s) + 1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		for (Entry<String, Integer> e : map.entrySet())
		{
			System.out.println(e.getKey() + "---" + e.getValue());
		}
	}

}
