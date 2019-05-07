class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        length = len(s)
        ans = 0
        left = 0
        right = 0
        lst = []
        while left < length and right < length:
            if(s[right] not in lst) :
                lst.append(s[right])
                right = right + 1
                ans = max(ans, right - left)    
            else:
                lst.remove(s[left])
                left = left + 1
        return ans