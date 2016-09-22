# Input: `numbers = {2, 7, 11, 15}`, `target = 9`

# Output: `index1 = 1`, `index2 = 2`

def twoSum(numbers, target)
   (0...numbers.length).step(1) do |index1|
      (1...numbers.length).step(1) do |index2|
         if numbers[index1] + numbers[index2] == target
            p [index1 + 1, index2 + 1]
            return true
         end
      end
   end

   p 'No 2 sum'
   return true
end

# TestCase
twoSum([2,7,11,15], 9)
# twoSum([3,15,37,22,48], 85)
# twoSum([3,24,53,4], 100)