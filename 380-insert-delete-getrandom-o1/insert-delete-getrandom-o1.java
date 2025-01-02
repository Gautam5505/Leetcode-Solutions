import java.util.*;

class RandomizedSet {
    private HashMap<Integer, Integer> map; 
    private List<Integer> list; 
    private Random random; 

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; 
        }
        list.add(val); 
        map.put(val, list.size() - 1); 
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
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Example Usage:
 * RandomizedSet randomizedSet = new RandomizedSet();
 * System.out.println(randomizedSet.insert(1)); // true
 * System.out.println(randomizedSet.remove(2)); // false
 * System.out.println(randomizedSet.insert(2)); // true
 * System.out.println(randomizedSet.getRandom()); // 1 or 2
 * System.out.println(randomizedSet.remove(1)); // true
 * System.out.println(randomizedSet.insert(2)); // false
 * System.out.println(randomizedSet.getRandom()); // 2
 */
