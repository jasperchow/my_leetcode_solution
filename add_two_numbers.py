# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        lst1 = []
        lst2 = []
        c1 = 0
        c2 = 0
        while(l1 != None):
            c1 += 1
            lst1.append(l1.val)
            l1 = l1.next
        while(l2 !=  None):
            c2 += 1
            lst2.append(l2.val)
            l2 = l2.next
        lst1.reverse()
        lst2.reverse()   
        result1 = 0
        result2 = 0
        i = 0
        while(c1 > 0):
            result1 += lst1[i] * (10 ** (c1 -1))
            i += 1
            c1 -= 1
        i = 0
        while(c2 > 0):
            result2 += lst2[i] * (10 ** (c2 - 1))
            i += 1
            c2 -= 1
        result = result1 + result2
        length = len(str(result))
        string = str(result)
        lst = []
        i = 0
        for i in range(0,length):
            lst.append(int(string[i]))
        lst.reverse()
        for index, e in enumerate(lst):
            if index == 0:
                # make it as a head
                result = ListNode(e)
                cur = result
            else:
                cur.next = ListNode(e)
                cur = cur.next
        return result
        
        
        