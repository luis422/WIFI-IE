package importprofileswifixml;

import java.awt.Image;
import java.awt.Toolkit;

public class ImportProfilesWifiXML {

    public static void main(String[] args) {
        
        Termos t = new Termos();
        Image iconFrame = Toolkit.getDefaultToolkit().getImage(t.getClass().getResource("/importprofileswifixml/icon.png"));
        t.setIconImage(iconFrame);
        t.setLocationRelativeTo(null);
        t.setVisible(true);
    }
}
