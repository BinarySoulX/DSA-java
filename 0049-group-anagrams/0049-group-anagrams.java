class Solution { //Pattern: HasMap+array freq
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] freq = new int[26];

            // Count freq of each character
            for (char ch : str.toCharArray()) {
                freq[ch - 'a']++;
            }
            // Create a unique key(HashCode)
            StringBuilder key = new StringBuilder();
            for (int count : freq) {
                key.append('#').append(count);
            }
            // Store in HashMap
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}