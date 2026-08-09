class Solution {
    public int lastStoneWeight(int[] stones) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int x : stones) {
            list.add(x);
        }

        while (list.size() > 1) {

            int max1 = -1, max2 = -1;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max1) {
                    max2 = max1;
                    max1 = list.get(i);
                } else if (list.get(i) > max2) {
                    max2 = list.get(i);
                }
            }

            list.remove(Integer.valueOf(max1));
            list.remove(Integer.valueOf(max2));

            if (max1 != max2) {
                list.add(max1 - max2);
            }
        }

        return list.isEmpty() ? 0 : list.get(0);
    }
}