package colorfulledpanel.LEDpanel;

import necesse.gfx.gameTexture.GameTexture;
import necesse.level.gameObject.LEDPanelObject;

import java.awt.*;

public class ColorfulLEDPanelObject extends LEDPanelObject {

    String textureFileName;

    public ColorfulLEDPanelObject(Color mapColor, String textureFileName) {
        this.mapColor = mapColor;
        this.textureFileName = textureFileName;
    }

    @Override
    public void loadTextures() {
        super.loadTextures();
        texture = GameTexture.fromFile("objects/" + textureFileName);
    }
}
