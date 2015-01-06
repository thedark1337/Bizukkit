package io.github.GoDieBawb.Bizukkit;

import java.util.HashMap;
import java.util.HashSet;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author GoDieBawb
 * @author Alex 'Thedark1337' Pham
 *
 */
public class Bizukkit extends JavaPlugin implements Listener {

    Player player;

    HashMap<String, String> language = new HashMap<String, String>();
    HashSet<String> players = new HashSet<String>();
    String playerName;
    Languages Langs = new Languages();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {

    }

    /**
     * @param name
     *            Player Username to check
     * @param lang
     *            Language to check
     * @return True if in HashSet, false if not
     */
    public boolean checkLang(String name, String lang) {
        return language.containsKey(name) && language.containsValue(lang);
    }

    /**
     * @return A comma delimited list of possible languages that can be used.
     */
    public String getLanguages() {
        String result = "";
        for (int i = 0, length = Constants.languages.size(); i < length; i++)
            result += (i == 0 ? "" : ", ") + Constants.languages.get(i);
        return result;
    }

    public String getLang(String name) {
        return language.get(name);
    }

    /*
     * @param name Player Username to check if in ArrayList
     * 
     * @return true if it is, false if not.
     */
    public boolean checkList(String name) {
        return players.contains(name);
    }

    @SuppressWarnings("deprecation")
    public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {

        if (sender instanceof ConsoleCommandSender)
            return false;
        if (cmd.getName().equalsIgnoreCase("biz") && args.length > 0) {
            if (args.length < 2) {
                if (Constants.languages.contains(args[0].toLowerCase())) {
                    Player player = Bukkit.getPlayerExact(sender.getName().toLowerCase());
                    if (player != null) {
                        playerName = sender.getName().toLowerCase();
                    }
                } else {
                    sender.sendMessage("Invalid Language Specified.");
                    sender.sendMessage("Possible Languages: " + getLanguages());
                }
            } else if (args.length > 3) {
                sender.sendMessage("Too many arguments");

            } else if (sender.hasPermission("bizukkit.other")) {
                Player receiver = Bukkit.getPlayerExact(args[1]);
                if (receiver != null) {
                    playerName = receiver.getName();
                } else {
                    sender.sendMessage("Invalid user specified");
                }
            } else {
                sender.sendMessage(Constants.noPermission);
            }

            switch (args[0].toLowerCase()) {
                case Constants.british:
                    if (sender.hasPermission(Constants.bPerm)) {
                        if (checkLang(playerName, Constants.british) && checkList(playerName) == true) {
                            sender.sendMessage(playerName + Constants.nSpeaking + Constants.british + "!");
                            language.remove(playerName);
                            players.remove(playerName);
                        } else {
                            sender.sendMessage(playerName + Constants.speaking + "!");
                            language.put(playerName, Constants.british);
                            players.add(playerName);
                        }
                    } else {
                        sender.sendMessage(Constants.noPermission);
                    }
                    break;
                case Constants.ghetto:
                    if (sender.hasPermission(Constants.gPerm) && checkList(playerName) == true) {
                        if (checkLang(playerName, Constants.ghetto)) {
                            sender.sendMessage(playerName + Constants.nSpeaking + Constants.ghetto + "!");
                            language.remove(playerName);
                            players.remove(playerName);
                        } else {
                            sender.sendMessage(playerName + Constants.speaking + Constants.ghetto + "!");
                            language.put(playerName, Constants.ghetto);
                            players.add(playerName);
                        }
                    } else {
                        sender.sendMessage(Constants.noPermission);
                    }
                    break;
                case Constants.l33t:
                    if (sender.hasPermission(Constants.lPerm)) {
                        if (checkLang(playerName, Constants.l33t) && checkList(playerName) == true) {
                            sender.sendMessage(playerName + Constants.nSpeaking + Constants.l33t + "!");
                            language.remove(playerName);
                            players.remove(playerName);

                        } else {
                            sender.sendMessage(playerName + Constants.speaking + Constants.l33t + "!");
                            language.put(playerName, Constants.l33t);
                            players.add(playerName);
                        }

                    } else {
                        sender.sendMessage(Constants.noPermission);
                    }
                    break;
                case Constants.nonsense:
                    if (sender.hasPermission(Constants.nPerm)) {
                        if (checkLang(playerName, Constants.nonsense) && checkList(playerName) == true) {
                            sender.sendMessage(playerName + Constants.nSpeaking + Constants.nonsense + "!");
                            language.remove(playerName);
                            players.remove(playerName);

                        } else {
                            sender.sendMessage(playerName + Constants.speaking + Constants.nonsense + "!");
                            language.put(playerName, Constants.nonsense);
                            players.add(playerName);
                        }
                    } else {
                        sender.sendMessage(Constants.noPermission);
                    }
                    break;
                case Constants.pirate:
                    if (sender.hasPermission(Constants.pPerm)) {
                        if (checkLang(playerName, Constants.pirate) && checkList(playerName) == true) {
                            sender.sendMessage(playerName + Constants.nSpeaking + Constants.pirate + "!");
                            language.remove(playerName);
                            players.remove(playerName);

                        } else {
                            sender.sendMessage(playerName + Constants.speaking + Constants.pirate + "!");
                            language.put(playerName, Constants.pirate);
                            players.add(playerName);
                        }
                    } else {
                        sender.sendMessage(Constants.noPermission);
                    }
                    break;
                case Constants.rich:
                    if (sender.hasPermission(Constants.rPerm)) {
                        if (checkLang(playerName, Constants.rich) && checkList(playerName) == true) {
                            sender.sendMessage(playerName + Constants.nSpeaking + Constants.rich + "!");
                            language.remove(playerName);
                            players.remove(playerName);

                        } else {
                            sender.sendMessage(playerName + Constants.speaking + Constants.rich + "!");
                            language.put(playerName, Constants.rich);
                            players.add(playerName);
                        }
                    } else {
                        sender.sendMessage(Constants.noPermission);
                    }
                    break;
                case Constants.smiley:
                    if (sender.hasPermission(Constants.sPerm)) {
                        if (checkLang(playerName, Constants.smiley) && checkList(playerName) == true) {
                            sender.sendMessage(playerName + Constants.nSpeaking + Constants.smiley + "!");
                            language.remove(playerName);
                            players.remove(playerName);

                        } else {
                            sender.sendMessage(playerName + Constants.speaking + Constants.smiley + "!");
                            language.put(playerName, Constants.smiley);
                            players.add(playerName);
                        }
                    } else {
                        sender.sendMessage(Constants.noPermission);
                    }
                    break;
            }
            return true;
        } else {
            sender.sendMessage(ChatColor.DARK_GREEN + "=====" + ChatColor.BLUE + "Bizukkit" + ChatColor.DARK_GREEN + "=====");
            sender.sendMessage(ChatColor.DARK_GREEN + "/biz" + ChatColor.BLUE + "Shows This help command" + ChatColor.DARK_GREEN + "=====");
            sender.sendMessage(ChatColor.DARK_GREEN + "/biz <language> <player>" + ChatColor.BLUE + "Translates either own or player's chat to lang specified"
                    + ChatColor.DARK_GREEN + "=====");
            sender.sendMessage(ChatColor.DARK_GREEN + "=====" + ChatColor.BLUE + "Languages Possible: " + ChatColor.DARK_GREEN + "=====");
            sender.sendMessage(ChatColor.DARK_GREEN + "=====" + ChatColor.BLUE + getLanguages() + ChatColor.DARK_GREEN + "=====");

        }
        return false;
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        player = event.getPlayer();
        playerName = player.getName().toLowerCase();
        String playerMessage = event.getMessage();
        if (getLang(playerName) != null && checkList(playerName) == true) {
            switch (getLang(playerName)) {
                case Constants.british:
                    Langs.makeBrit(player, playerMessage, event);
                    break;
                case Constants.ghetto:
                    Langs.makeGhetto(player, playerMessage, event);
                    break;
                case Constants.l33t:
                    Langs.makeLeet(player, playerMessage, event);
                    break;
                case Constants.nonsense:
                    Langs.makeRandom(player, playerMessage, event);
                    break;
                case Constants.pirate:
                    Langs.makePirate(player, playerMessage, event);
                    break;
                case Constants.rich:
                    Langs.makeRich(player, playerMessage, event);
                    break;
                case Constants.smiley:
                    Langs.makeSmiley(player, playerMessage, event);
                    break;
            }
        }
    }
}
