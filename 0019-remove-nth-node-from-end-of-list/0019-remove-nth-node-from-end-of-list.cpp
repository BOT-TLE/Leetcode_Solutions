/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
 
    int help(ListNode* head){
           int i=1;
       while(head->next!=NULL){
            i++;
           head=head->next;
          
       }
       return i;
        
    }
    ListNode* removeNthFromEnd(ListNode* head, int n) {
          if(head==NULL)
        return NULL;
        if(head->next==NULL && n==1)
        return NULL;
        int len=help(head);
        if(len==n)
        {
            head=head->next;
            return head;
        }
     
        int j=len-n;
        ListNode* p=head;
        int k=1;
        while(k<j){
            p=p->next;
            k++;
        }
        ListNode* deln=p->next;
        p->next=p->next->next;
        delete deln;
        return head;
        
    }
};

   
        