package LeetCode;

class ListNode 
{
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}


class Solution 
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        ListNode head = null;
        ListNode prev = null;
        while (l1!=null && l2!=null)
        {
            ListNode new_node;
            if(l1.val <= l2.val)
            {
                new_node = new ListNode(l1.val);
                //new_node.next = null;
                l1 = l1.next;
            }
            else
            {
                new_node = new ListNode(l2.val);
                //new_node.next = null;
                l2 = l2.next;
            }
            if (prev == null)
            {
                prev = new_node;
            }
            else
            {
                prev.next = new_node;
                prev = new_node;
            }
            if (head==null)
            {
                head = new_node;
            }
        }
        while(l1!=null)
        {
            ListNode new_node = new ListNode(l1.val);
            l1 = l1.next;
            if (head==null)
            {
                head = new_node;
            }
            if (prev == null)
            {
                prev = new_node;
            }
            else
            {
                prev.next = new_node;
                prev = new_node;
            }
        }
        while(l2!=null)
        {
            ListNode new_node = new ListNode(l2.val);
            l2 = l2.next;
            if (head==null)
            {
                head = new_node;
            }
            if (prev == null)
            {
                prev = new_node;
            }
            else
            {
                prev.next = new_node;
                prev = new_node;
            }
        }
        return head;
    }
}

public class MergeSortedList 
{
	public static void main (String args[])
	{
		ListNode head1=null , head2=null, prev_node=null;
		int[] l1 = {2, 5, 6, 7, 10};
		int[] l2 = {1, 3, 4, 8, 9, 11};
		for (int i=0; i<l1.length;i++)
		{
			ListNode new_node = new ListNode(l1[i]);
			if (head1==null)
			{
				head1 = new_node;
			}
			if(prev_node==null)
			{
				prev_node = new_node;
			}
			else
			{
				prev_node.next = new_node;
				prev_node = new_node;
			}
		}
		prev_node = null;
		for (int i=0;i<l2.length;i++)
		{
			ListNode new_node = new ListNode(l2[i]);
			if(head2==null)
			{
				head2 = new_node;
			}
			if (prev_node==null)
			{
				prev_node = new_node;
			}
			else
			{
				prev_node.next = new_node;
				prev_node = new_node;
			}
		}
		Solution obj = new Solution();
		ListNode h1 = head1, h2 = head2;
		ListNode merged = obj.mergeTwoLists(h2, h1);
		ListNode temp = merged;
		while (temp!= null)
		{
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}
