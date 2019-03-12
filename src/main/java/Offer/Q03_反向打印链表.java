package Offer;

import java.util.ArrayList;
import java.util.Stack;

public class Q03_�����ӡ���� {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		ArrayList<Integer> res = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			res.add(stack.pop());
		}
		return res;
	}
}
