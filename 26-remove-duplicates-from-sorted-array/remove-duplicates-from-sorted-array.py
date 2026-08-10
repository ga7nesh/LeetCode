class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        curr = 0
        rep = 1
        while rep < len(nums):
            if nums[curr] == nums[rep]:
                rep += 1
            else:
                curr += 1
                nums[curr] = nums[rep]
                rep += 1
        
        return curr+1

            
                