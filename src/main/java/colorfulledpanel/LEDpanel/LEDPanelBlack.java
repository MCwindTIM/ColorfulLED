package colorfulledpanel.LEDpanel;

import necesse.gfx.gameTexture.GameTexture;
import necesse.level.gameObject.LEDPanelObject;

import java.awt.*;

public class LEDPanelBlack extends LEDPanelObject {
    public LEDPanelBlack() {
        mapColor = new Color(0, 0, 0);
    }

    @Override
    public void loadTextures() {
        super.loadTextures();
        texture = GameTexture.fromFile("objects/ledpanelblack");
    }
}
