class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxLength=0
        if len(s)==1:
            return 1
        for i in range(len(s)):
            j=i
            l=0
            b=''
            while s[j] not in b:
                b=b+s[j]
                l+=1
                j+=1
                if j==len(s):
                    break
                # print(i,' ',j)
            
            if maxLength<l:
                maxLength=l
                
            if len(s)-1-i<=maxLength:
                break
        
        return maxLength