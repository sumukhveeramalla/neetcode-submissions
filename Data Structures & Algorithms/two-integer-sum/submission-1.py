class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        #Time Complexity O(n^2)
        
        # for i in range(len(nums)-1):
        #     num = target - nums[i]
        #     for j in range(i+1,len(nums)):
        #         if(nums[j] == num):
        #             return [i,j]

        #Time Complexity O(n)

        prevMap = {} #val:ind

        for i,n in enumerate(nums):
            diff = target - n
            if diff in prevMap:
                return [prevMap[diff],i]
            prevMap[n] = i

        return []

        