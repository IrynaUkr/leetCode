package easy.tasks;

//https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=level-1
public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {
        int high = n;
        int low = 1;


        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (!isBadVersion(mid)) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
         return low;
    }
}

