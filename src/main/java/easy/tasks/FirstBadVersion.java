package easy.tasks;

//https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=level-1
public class FirstBadVersion extends VersionControl {
    public static boolean isBad(int vers) {
        return false;
    }

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

    public static int badVersion(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //if version is good try to find by in latest
            if (!isBad(mid)) {
                start= mid + 1;
            } else {
                //if version is bad, try to find in earliest
                end = mid-1;
            }
        }
        return  start;
    }

}

