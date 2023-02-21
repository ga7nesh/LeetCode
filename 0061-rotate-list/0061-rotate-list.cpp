class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if(head==NULL) return head;
        int cnt=1;
        ListNode *temp=head;
        while(temp->next!=NULL)
        {
            temp=temp->next;
            cnt++;
        }
        temp->next=head;
        k=k%cnt;
        for(auto i=0;i<cnt-k;i++)
        {
            temp=temp->next;
        }
        head=temp->next;
        temp->next=NULL;
        return head;
        
        


    }
};