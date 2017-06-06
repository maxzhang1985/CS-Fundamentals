// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

// Note:
// You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

// var merge = function(nums1, m, nums2, n) {
//   if (m > 0 && n > 0) {
//     console.log('Returned: ' + nums1.concat(nums2).sort());
//     return nums1.concat(nums2).sort();
//   } else if (m === 0 && n > 0) {
//     console.log('Returned: ' + nums2);
//     return nums2;
//   } else if (m > 0 && n === 0) {
//     console.log('Returned: ' + nums1);
//     return nums1;
//   } else {
//     console.log('Returned: ' + []);
//     return [];
//   }
// };

// var merge = function(nums1, m, nums2, n) {
//   nums1.length = m,
//   nums2.length = n;

//   Array.prototype.push.apply(nums1, nums2);
//   nums1.sort(function(a, b) {
//     console.log(a - b);
//     return a - b;
//   });
// };

var merge = function(nums1, m, nums2, n) {
    // starting from the end!
    while(m > 0 && n > 0) {
        if (nums1[m - 1] > nums2[n - 1]) {
            nums1[m + n - 1] = nums1[m - 1];
            m--;
        } else {
            nums1[m + n - 1] = nums2[n - 1];
            n--;
        }
    }

    while (n > 0) {
        nums1[n - 1] = nums2[n - 1];
        n--;
    }
};
// Test Case
merge([1,3,5,7], 4, [2,4,6,8], 4);
merge([0],0,[1],1)
merge([1],1,[],0)
merge([0],0,[0],0)