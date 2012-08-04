/**
 * @author qiushaohua 2012-6-24
 */
package com.qiuq.inventory.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.qiuq.inventory.bean.env.Theme;

/**
 * @author qiushaohua 2012-6-24
 * @version 0.0.1
 */
@Component
@Scope("session")
public class ThemeSwitcherBean {
    private Map<String, String> themes;

    private List<Theme> advancedThemes;

    private GuestPreferences gp;

    @Autowired
    public void setGp(GuestPreferences gp) {
        this.gp = gp;
    }

    public Map<String, String> getThemes() {
        return themes;
    }

    public String getTheme() {
        return gp.getTheme();
    }

    public void setTheme(String theme) {
        gp.setTheme(theme);
    }

    @PostConstruct
    public void init() {

        advancedThemes = new ArrayList<Theme>();
        advancedThemes.add(new Theme("aristo", "aristo.png"));
        advancedThemes.add(new Theme("cupertino", "cupertino.png"));
        advancedThemes.add(new Theme("trontastic", "trontastic.png"));

        themes = new TreeMap<String, String>();
        themes.put("Aristo", "aristo");
        themes.put("Black-Tie", "black-tie");
        themes.put("Blitzer", "blitzer");
        themes.put("Bluesky", "bluesky");
        themes.put("Casablanca", "casablanca");
        themes.put("Cupertino", "cupertino");
        themes.put("Dark-Hive", "dark-hive");
        themes.put("Dot-Luv", "dot-luv");
        themes.put("Eggplant", "eggplant");
        themes.put("Excite-Bike", "excite-bike");
        themes.put("Flick", "flick");
        themes.put("Glass-X", "glass-x");
        themes.put("Hot-Sneaks", "hot-sneaks");
        themes.put("Humanity", "humanity");
        themes.put("Le-Frog", "le-frog");
        themes.put("Midnight", "midnight");
        themes.put("Mint-Choc", "mint-choc");
        themes.put("Overcast", "overcast");
        themes.put("Pepper-Grinder", "pepper-grinder");
        themes.put("Redmond", "redmond");
        themes.put("Rocket", "rocket");
        themes.put("Sam", "sam");
        themes.put("Smoothness", "smoothness");
        themes.put("South-Street", "south-street");
        themes.put("Start", "start");
        themes.put("Sunny", "sunny");
        themes.put("Swanky-Purse", "swanky-purse");
        themes.put("Trontastic", "trontastic");
        themes.put("UI-Darkness", "ui-darkness");
        themes.put("UI-Lightness", "ui-lightness");
        themes.put("Vader", "vader");
    }

    public void saveTheme() {
    }

    public List<Theme> getAdvancedThemes() {
        return advancedThemes;
    }
}
