package ca.tweetzy.skulls.commands;

import ca.tweetzy.flight.command.AllowedExecutor;
import ca.tweetzy.flight.command.Command;
import ca.tweetzy.flight.command.ReturnType;
import ca.tweetzy.flight.settings.TranslationManager;
import ca.tweetzy.flight.utils.Common;
import ca.tweetzy.skulls.Skulls;
import ca.tweetzy.skulls.settings.Translations;
import org.bukkit.command.CommandSender;

import java.io.IOException;
import java.util.List;

public class ReloadCommand extends Command {

    public ReloadCommand() {
        super(AllowedExecutor.BOTH, "reload");
    }

    @Override
    protected ReturnType execute(CommandSender commandSender, String... strings) {
        if (commandSender.hasPermission("skulls.command.reload")) {
            try {
                Skulls.getCoreConfig().load();
                Skulls.getCoreConfig().save();
                Common.tell(commandSender, TranslationManager.string(Translations.COMMAND_RELOAD));
            } catch (IOException e) {
                return ReturnType.FAIL;
            }
        }
        return ReturnType.SUCCESS;
    }

    @Override
    protected List<String> tab(CommandSender commandSender, String... strings) {
        return null;
    }

    @Override
    public String getPermissionNode() {
        return "skulls.command.reload";
    }

    @Override
    public String getSyntax() {
        return "skulls reload";
    }

    @Override
    public String getDescription() {
        return "The main command for the plugin";
    }
}
