package Offer;

public class Q14_������k��� {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode FindKthToTail(ListNode head, int k) {
		ListNode pre = null, p = null;
		// ����ָ�붼ָ��ͷ���
		p = head;
		pre = head;
		// ��¼kֵ
		int a = k;
		// ��¼�ڵ�ĸ���
		int count = 0;
		// pָ�����ܣ����Ҽ�¼�ڵ�������pָ������k-1���ڵ��preָ�뿪ʼ�ܣ�
		// ��pָ���ܵ����ʱ��pre��ָָ����ǵ�����k���ڵ�
		while (p != null) {
			p = p.next;
			count++;
			if (k < 1) {
				pre = pre.next;
			}
			k--;
		}
		// ����ڵ����С������ĵ�����k���ڵ㣬�򷵻ؿ�
		if (count < a)
			return null;
		return pre;

	}
}
