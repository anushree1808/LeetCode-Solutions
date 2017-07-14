package LeetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNode 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int length=0;
        ListNode temp = head;
        while(temp!=null)
        {
            length+=1;
            temp = temp.next;
        }
        
        temp = head;
        if (length == n)
        {
            head = head.next;
            return head;
        }
        //ListNode temp2 = temp;
        for(int i=1;i< length-n;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
