package easy.tasks;

import java.util.Date;
import java.util.UUID;

public class PowerOfTwo implements AlertDao {
    public static String PowersofTwo(int num) {

        for (int i = 1; i <= num; i = i * 2) {

            if (i == num) {

                return "true";
            }
        }
        return "false";

    }

    public static void main(String[] args) {
        System.out.println(PowersofTwo(11));
    }

    @Override
    public UUID addAlert(Date time) {
        return null;
    }

    @Override
    public Date getAlert(UUID id) {
        return null;
    }

}
interface AlertDao{
    public UUID addAlert(Date time);

    public Date getAlert(UUID id);
}
