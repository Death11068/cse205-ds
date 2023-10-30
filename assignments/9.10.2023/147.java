import java.util.*;
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // No need to sort if the list has 0 or 1 element.
        }

        int length = 0;
        ListNode curr = head;

        // Calculate the length of the linked list.
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        int[] nums = new int[length];
        curr = head;
        int i = 0;

        // Populate the array with node values using a while loop.
        while (curr != null) {
            nums[i] = curr.val;
            curr = curr.next;
            i++;
        }

        // Sort the array.
        Arrays.sort(nums);

        curr = head;
        i = 0;

        // Reconstruct the linked list with sorted values.
        while (curr != null) {
            curr.val = nums[i];
            curr = curr.next;
            i++;
        }

        return head;
    }
}