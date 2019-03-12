package Offer;
//题目描述
//输入一个链表，反转链表后，输出链表的所有元素。
public class Q15_反转链表 {
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	public ListNode ReverseList(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode pre = null; //前一结点
		ListNode next = null;//后一结点
		while(head!=null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;

    }
}
