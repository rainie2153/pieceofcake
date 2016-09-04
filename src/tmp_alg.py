
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution(object):
    def sortedListToBST(self, head):
        """
        :type head: ListNode
        :rtype: TreeNode
        """
        p_node = head
        n = 0
        while p_node:
            p_node = p_node.next
            n += 1
        rest = self.sortedBST(head, n)
        return rest

    def sortedBST(self, head, n):
        if n <= 1:
            if n <= 0:
                return None
            else:
                return TreeNode(head.val)
        else:
            left = self.sortedBST(head, n/2)
            p_node = head
            i = 0
            while i < n/2:
                p_node = p_node.next
                i += 1
            root = TreeNode(p_node.val)
            right = self.sortedBST(p_node.next, n - n/2 -1)
            root.left = left
            root.right = right
            return root

x1 = ListNode(1)
x2 = ListNode(2)
x3 = ListNode(3)
x1.next = x2
x2.next = x3

y = Solution()
z = y.sortedListToBST(x1)
print z.val

