class Solution {
public:
    void sortColors(vector<int>& nums) {
    int zI = 0, tI = nums.size() - 1, ptr = 0;
    while (ptr <= tI) {
        if (nums[ptr] == 0) {
            nums[ptr++] = 1;
            nums[zI++] = 0;
        } else if (nums[ptr] == 2) {
            nums[ptr] = nums[tI];
            nums[tI--] = 2;
        } else {
            ptr++;
        }
    }
    return;
    }
};
