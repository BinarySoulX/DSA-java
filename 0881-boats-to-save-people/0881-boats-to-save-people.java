class Solution {//Pattern: Greedy(2pointer)
    public int numRescueBoats(int[] people, int limit) {
        int light = 0;
        int heavy = people.length - 1;
        int boats = 0;
        Arrays.sort(people);

        while (light <= heavy) {
            // If the lightest and heaviest person can share a boat
            if (people[light] + people[heavy] <= limit) {
                light++; // Lightest person gets on board
            }
            // Heaviest person ALWAYS gets a boat (either alone or paired)
            heavy--;
            boats++;
        }return boats;
    }
}