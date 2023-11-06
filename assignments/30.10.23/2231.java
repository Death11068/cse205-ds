class Solution {
    public int largestInteger(int k) {
        PriorityQueue<Integer> even = new PriorityQueue<>();
        PriorityQueue<Integer> odd = new PriorityQueue<>();

        int t = k;
        int rem;
        while (t > 0) {
            rem = t % 10;
            if ((rem & 1) == 1) {
                odd.add(rem);
            } else {
                even.add(rem);
            }
            t /= 10;
        }
        int b = 1;
        while (k > 0) {
            rem = k % 10;
            if ((rem & 1) == 1) {
                t = odd.poll() * b + t;
            } else {
                t = even.poll() * b + t;
            }
            b *= 10;
            k /= 10;
        }
        return t;
    }
}