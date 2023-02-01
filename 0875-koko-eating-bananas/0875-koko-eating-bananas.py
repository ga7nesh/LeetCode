import math
class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        l = 1
        r = 10**9
        while l<r:
            mid = (l+r)//2
            if self.isPossible(piles, mid, h):
                r = mid
            else:
                l = mid+1
        return l


    def isPossible(self, piles, k, h):
        hrs = 0
        for x in piles:
            hrs += math.ceil(x/k)
        return hrs <= h