import java.util.*;

class RandomizedSet {
    private HashMap<Integer, Integer> map; 
    private List<Integer> list; 

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; 
        }
        list.add(val); // Add to the list
        map.put(val, list.size() - 1); // Map the value to its index in the list
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; 
        }
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);
        map.put(lastElement, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Example Usage:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
