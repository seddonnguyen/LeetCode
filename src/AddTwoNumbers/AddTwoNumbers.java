package AddTwoNumbers;// Source: https://leetcode.com/problems/add-two-numbers/

public class AddTwoNumbers {
    public static ListNode buildLinkList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static int[] convertLinkListToArray(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        int[] arr = new int[length];
        current = head;
        for (int i = 0; i < length; i++) {
            arr[i] = current.val;
            current = current.next;
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}