import java.util.HashMap;
import java.util.Map;

public class intersectingNode {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode timkiem(ListNode heada, ListNode headb) {
        Map<Integer, Integer> map = new HashMap<>();
        while (heada != null) {
            map.put(heada.val, 1);
            heada = heada.next;
        }

        while (headb != null) {
            if (map.containsKey(headb.val) && map.get(headb.val) == 1) {
                return headb;
            }
            headb = headb.next;
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(5);
        ListNode a4 = new ListNode(6);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        ListNode b1 = new ListNode(7);
        ListNode b2 = new ListNode(8);
        ListNode b3 = new ListNode(9);
        ListNode b4 = new ListNode(6);
        b1.next = b2;
        b2.next = b3;
        b3.next = b4;

        ListNode result = timkiem(a1, b1);
        if (result != null) {
            System.out.println("Common node value: " + result.val);
        } else {
            System.out.println("No common node found.");
        }
    }
}
