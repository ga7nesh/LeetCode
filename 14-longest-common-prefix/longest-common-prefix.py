class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        min_len = len(min(strs,key=len))
        res = ""

        for i in range(min_len):
            for j in range(len(strs)):
                if strs[j][i] != strs[0][i]:
                    return res; 
            
            res = res+strs[j][i]

        return res;         
                