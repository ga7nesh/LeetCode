class Solution:
    def isPalindrome(self, x: int) -> bool:
        rev = 0
        original = x

        while x > 0:
            val = x % 10
            x = x // 10
            rev = rev*10+val
        
        if rev == original:
            return True
        else:
            return False 
        