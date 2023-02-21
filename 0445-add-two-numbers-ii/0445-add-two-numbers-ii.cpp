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

    ListNode* helper(ListNode* l1, ListNode* l2){
        if(l1 == NULL){
            return l2;
        }
        if(l2 == NULL){
            return l1;
        }
        ListNode* head = NULL;
        ListNode* tail = NULL;
        
        int carry = 0;
        while(l1 != NULL || l2 != NULL){
            int sum = 0;
            if(l1 != NULL){
                sum += l1->val;
                l1 = l1->next;
            }
            if(l2 != NULL){
                sum += l2 -> val;
                l2 = l2 -> next;
            }
            
            sum += carry;
            
            ListNode* newnode = new ListNode(sum%10);
            if(head == NULL){
                head = tail = newnode;
            }
            else{
                tail -> next = newnode;
                tail = tail -> next;
            }
            carry = sum/10;       
        }
        
        if(carry != 0){
            ListNode* newnode = new ListNode(carry);
            tail -> next = newnode;
        }

        return head;
    }

    ListNode* reverse(ListNode* head){
        ListNode* prev = NULL;
        ListNode* curr = head;
        while(curr){
            ListNode* temp = curr->next;
            curr -> next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }

    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        l1 = reverse(l1);
        l2 =reverse(l2);
        ListNode* head = helper(l1,l2);

        return reverse(head);
    }
};