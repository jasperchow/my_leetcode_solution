class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        string = min(strs,key=len)
        strs.remove(strin                                                                                               g)
        for i, char in enumerate(string):
            for rest in strs:
                if rest[i] != char:
                    return string[:i]
        return string