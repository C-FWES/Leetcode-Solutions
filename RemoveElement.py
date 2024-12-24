class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        # pointers
        i = 0
        j = 0
        for i in range(0, len(nums)):
            first_pointer = nums[i]
            second_pointer = nums[j]
            if (first_pointer != val):
                nums[i] = second_pointer
                nums[j] = first_pointer
                j += 1
        return j
