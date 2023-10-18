class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n1 = nums1.size();
        int n2 = nums2.size();
        if(n1>n2) return  findMedianSortedArrays(nums2,nums1);

        int low = 0;
        int high = n1;

        int n = (n1+n2+1)/2;

        while(low<=high){
            int mid1 = (low + high)/2;
            int mid2 = n-mid1;

            int l1 = mid1>=1?nums1[mid1-1]:INT_MIN;
            int l2 = mid2>=1?nums2[mid2-1]:INT_MIN;

            int r1 = mid1<n1 ? nums1[mid1]:INT_MAX;
            int r2 = mid2<n2 ? nums2[mid2]:INT_MAX;

            if(l1<=r2 and l2<=r1){
                if((n1+n2)%2==0)
                    return (max(l1,l2)+min(r1,r2))/2.0;
                return double(max(l1,l2));
            }

            else if(l1>r2){
                high = mid1-1;
            }
            else{
                low = mid1+1;
            }

        }

        return 0.0;
    }
};