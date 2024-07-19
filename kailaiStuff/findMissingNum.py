class Solution:
    def findMissingNumber(self, nums):
        n = len(nums)

        i = 0
        while i < len(nums):
            j = nums[i]  # Calculate the index where the current element should be placed.
            if j >= n:
                i = i + 1
            elif nums[i] != nums[j]:  # Check if the current element is not in its correct position.
                nums[i], nums[j] = nums[j], nums[i]  # Swap the current element with the one at its correct position.
            else:
                i += 1  # If the current element is already in its correct position, move to the next element.
        for x in range(n):
            if not (nums[x] == x):
                return x
        return n
