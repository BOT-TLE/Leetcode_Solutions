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
    ListNode* removeZeroSumSublists(ListNode* head) {
        ListNode node = ListNode(0, head);
        unordered_map<int, ListNode*> mp;
        
        ListNode* tmp = &node;
        int sum = 0;
        while(tmp)
        {
            sum += tmp->val;
            mp[sum] = tmp;
            tmp = tmp->next;
        }

        sum = 0;
        tmp = &node;

        while(tmp)
        {
            sum += tmp->val;
            tmp->next = mp[sum]->next;
            tmp = tmp -> next;
        }

        delete tmp;
        return node.next;
        
    }
};