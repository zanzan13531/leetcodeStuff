class Solution:
    def sort(self, nums):
    # TODO: Write your code here

        for i in range(len(nums)):
            x = i
            while (nums[x] != x + 1):
                # swap two things
                a = nums[x]
                b = nums[a - 1]
                nums[x] = b
                nums[a - 1] = a
                x = b - 1

        return nums
    
# 1, 5, 6, 4, 3, 2
# 1, 5, 6, 4, 3, 2
# 1, 3, 6, 4, 5, 2 x = 2
# 1, 3, 2, 4, 5, 6
#
#