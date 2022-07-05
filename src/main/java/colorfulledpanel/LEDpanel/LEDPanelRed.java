package colorfulledpanel.LEDpanel;

import necesse.gfx.gameTexture.GameTexture;
import necesse.level.gameObject.LEDPanelObject;

import java.awt.*;

public class LEDPanelRed extends LEDPanelObject {
    public LEDPanelRed() {
        mapColor = new Color(255, 0, 0);
    }

    @Override
    public void loadTextures() {
        super.loadTextures();
        texture = GameTexture.fromFile("objects/ledpanelred");
    }
}
