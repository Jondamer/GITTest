package com.offerCollections;


/**
 * 输入两个链表，找出它们的第一个公共结点
 * @author zhengzhentao
 *
 */



public class FindFirstCommonNodeSolution {

	public FindFirstCommonNodeSolution() {
		// TODO Auto-generated constructor stub
	}
//	定义一个函数得到链表的长度	
	static int linkedLength(ListNode head){
		int length=0;
		if(head.next==null){
			return 0;			
		}	
		while(head.next!=null){
			length++;
			head=head.next;
		}
		return length;
	}
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//    	考虑空值等特殊情况
    	if(pHead1.next==null){
    		return null;
    	}
    	if(pHead2.next==null){
    		return null;
    	}
		int Alength =linkedLength(pHead1);
		int Blength =linkedLength(pHead2);
		int dif=Alength-Blength;		
		ListNode PListHeadLong = pHead1;
		ListNode PListHeadShort = pHead2;	
//		现在长链表上走几步，再同时在两个链表上进行遍历
		for(int i=0;i<dif;i++){
			PListHeadLong =PListHeadLong .next;
		}		
		while(PListHeadLong!=null && PListHeadShort!=null && PListHeadLong!=PListHeadShort){
			PListHeadLong=PListHeadLong.next;
			PListHeadShort=PListHeadShort.next;
		}
//		得到第一个公共节点
		ListNode   CommonNode =PListHeadLong;
		return CommonNode;				
	    	 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
