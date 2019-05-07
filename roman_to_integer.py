class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans = 0
        dict1 = {"I":1, "IV":4,"V":5, "IX":9,"X":10,"XL":40,"L":50,"XC":90,"C":100,"CD":400,"D":500,"CM":900,"M":1000}
        while len(s) > 0:
            if s[0:2] in dict1.keys():
                key = s[0:2]
                ans += dict1[key]
                s = s[2:]
            elif s[0] in dict1.keys():
                key = s[0]
                ans += dict1[key]
                s = s[1:]
        return ans