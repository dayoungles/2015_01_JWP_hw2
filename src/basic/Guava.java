package basic;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class Guava {
	List<Object> randomObjects = Lists.newArrayList();
	Set<String> testSet = Sets.newHashSet();
	
	public int checkMap (String key, int value){
		Map<String, Integer> test = Maps.newHashMap();
		test.put(key, value);
		return test.get(key);
	}
	
	public void addItemList(Object obj){	
		randomObjects.add(obj);
	}
	public boolean checkList(Object obj){
		return randomObjects.contains(obj);
	}
	
	public void addItemToSet(String item){
		testSet.add(item);
	}
	public boolean checkSet(Object item){
		return testSet.contains(item);
	}
}
