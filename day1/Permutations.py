class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result=[]
        
        def backtrack(r):
            if len(nums)==len(r):
                result.append(r)
                return
            
            for num in nums:
                if num not in r:
                    # r.append(num)
                    backtrack(r+[num])
                    # r=[]
            return
        
        backtrack([])
        return result
    