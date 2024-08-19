package ca.tweetzy.skulls.settings;

import ca.tweetzy.flight.settings.FlightTranslator;
import ca.tweetzy.flight.settings.TranslationEntry;
import lombok.NonNull;
import org.bukkit.plugin.java.JavaPlugin;

public class TranslationManagerExtender extends FlightTranslator {

    private final JavaPlugin plugin;
    public static TranslationEntry NO_MONEY = create("error.not enough money", "&cYou do not have enough money!");
    public static TranslationEntry NO_PERMISSION = create("error.no permission", "&cYou do not have enough permission!");
    public static TranslationEntry NOT_A_NUMBER = create("error.not a number", "&4%value% &cis not a valid number!");
    public static TranslationEntry PLAYER_OFFLINE = create("error.player offline", "&4%value% &cis not online currently!");
    public static TranslationEntry PLAYER_NOT_FOUND = create("error.player not found", "&4%value% &cwas not found!");
    public static TranslationEntry ENABLED = create("conditionals.enabled", "&aEnabled");
    public static TranslationEntry DISABLED = create("conditionals.disabled", "&cDisabled");
    public static TranslationEntry TRUE = create("conditionals.true", "&aTrue");
    public static TranslationEntry FALSE = create("conditionals.false", "&CFalse");
    public static TranslationEntry OPEN = create("conditionals.open", "&aOpen");
    public static TranslationEntry CLOSED = create("conditionals.closed", "&cClosed");
    public static TranslationEntry MOUSE_LEFT_CLICK = create("button.left click", "Left Click");
    public static TranslationEntry MOUSE_SHIFT_LEFT_CLICK = create("button.left shift click", "Shift+Left Click");
    public static TranslationEntry MOUSE_RIGHT_CLICK = create("button.right click", "Right Click");
    public static TranslationEntry MOUSE_SHIFT_RIGHT_CLICK = create("button.left shift click", "Shift+Right Click");
    public static TranslationEntry MOUSE_MIDDLE_CLICK = create("button.middle click", "Middle Click");
    public static TranslationEntry NUMBER_KEY = create("button.number key", "Press # Key");
    public static TranslationEntry DROP_KEY = create("button.drop key", "Press Drop Key");

    public TranslationManagerExtender(@NonNull JavaPlugin plugin, @NonNull String locale) {
        super(locale);
        if (plugin == null) {
            throw new NullPointerException("plugin is marked non-null but is null");
        } else {
            this.plugin = plugin;
        }
    }

    protected void registerLanguages() {
        registerLanguage(this.plugin, mainLanguage);
    }
}
