package Offer;
//��Ŀ����
//����һ��������ת�����������������Ԫ�ء�
public class Q15_��ת���� {
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
		ListNode pre = null; //ǰһ���
		ListNode next = null;//��һ���
		while(head!=null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;

    }
}
