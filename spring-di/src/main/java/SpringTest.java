public class SpringTest {

    public static void main(String[] args) {
        TV dtv = (TV)SpringApplicationContext.getBeanInstance("tv");
        dtv.diplay();
    }
}
