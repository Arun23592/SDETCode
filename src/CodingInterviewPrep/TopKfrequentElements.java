package CodingInterviewPrep;
import java.util.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKfrequentElements {
	
	public static List<Integer> topkFrequent(int[] nums, int k){
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for(int num : nums) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+ 1);
		}
		
		
		//2. PriorityQueue to keep track of the top k
		
		PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(
				(a, b) -> a.getValue() - b.getValue()
		);
		return null;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

