package io.github.GoDieBawb.Bizukkit;

import java.util.Random;

import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * @author GoDieBawb
 * @author Alex 'Thedark1337' Pham
 *
 */
public class Languages {
    public Random generator = new Random();

    /**
     * This function is to translate chat to British
     * 
     * @param player
     *            Player object
     * @param playerMessage
     *            Player's message sent
     * @param event
     *            ASync Player Chat event from Bukkit.
     */
    public void makeBrit(Player player, String playerMessage, AsyncPlayerChatEvent event) {

        // Up Here We Write All the Words First So they aren't later replaced
        // With the British Grammar
        // Order things So they will not mess up words ex. Farmer before Farm

        // Most common words first so these are replaced before it continues

        playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b", "the");
        playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", "cheerio govna");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", "toodle pip");
        playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", "have");
        playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", " has ");
        playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", "that");
        playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", "this");
        playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b", "sticky wicket molly whopper");
        playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", "is nary");
        playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", "is nary");
        playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", "jolly well good");
        playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", "wankerish");
        playerMessage = playerMessage.replaceAll("(?i)\\band\\b", " and ");
        playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", "crumpet");
        playerMessage = playerMessage.replaceAll("(?i)\\bIm\\ssorry\\b", "I apologize");
        playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", "Aye mate");
        playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", "sticky wicket");
        playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", "peddling");
        playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", "peddle");
        playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", "toil");
        playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sto\\b", "how the bloody hell to");
        playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", "fresh");
        playerMessage = playerMessage.replaceAll("(?i)\\bany", " any bloody");
        playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", "Cor blimey mate");
        playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", "Save the Queen");
        playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", "for the Queen");
        playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", "inform");
        playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", "oi");

        // Cuss Words
        playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", "rubbish");
        playerMessage = playerMessage.replaceAll("(?i)\\bbitch\\b", "cunt");
        playerMessage = playerMessage.replaceAll("(?i)\\bfuck off\\b", "on your bike");
        playerMessage = playerMessage.replaceAll("(?i)\\bfucked\\b", "boffed");
        playerMessage = playerMessage.replaceAll("(?i)\\bfucking\\b", "bloody");
        playerMessage = playerMessage.replaceAll("(?i)\\bfucker\\b", "wanker");
        playerMessage = playerMessage.replaceAll("(?i)\\bfuck\\b", "boff");
        playerMessage = playerMessage.replaceAll("(?i)\\byour\\smom\\b", "the queen");
        playerMessage = playerMessage.replaceAll("(?i)\\bdick\\bb", "pecker");
        playerMessage = playerMessage.replaceAll("(?i)\\bpussy\\bb", "gash");

        // Common Phrases
        playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", "How are the crumpets mate?");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", "stab that wanker");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", "going to");
        playerMessage = playerMessage.replaceAll("(?i)\\bdo\\syou\\b", "Doth Thou");
        playerMessage = playerMessage.replaceAll("(?i)\\bare\\syou\\b", " art thou");
        playerMessage = playerMessage.replaceAll("(?i)\\bcan\\syou\\b", "prithee");
        playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sdo\\b", "how doth");

        // Minecraft Related Terms you can be specific here
        playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", "have a game of fisticuffs");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", "roundly defeat");
        playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", "motor car");
        playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", "roundly boffed");
        playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", "have a gentlemen's argument");
        playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", "the queens gold");
        playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", "wealthy");
        playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b", "have tea and crumpets with");
        playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", "juice");
        playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", "round table");

        // Food Items
        playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", "tea and crumpets");
        playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", "Pork Crumpets");
        playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b", "Tea and Chicken ");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", "beef and crumpets");

        // Personal Addressing
        playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", "bloke ");
        playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", " peasant ");
        playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", "babys mamma");
        playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b", "some ugly twit");
        playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", "mate");
        playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", " mum ");
        playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", " dad ");
        playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", "streetwalker");
        playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", " any of you bloody wankers");

        // Pronouns
        playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", "bird");
        playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", "bloke");
        playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", "that bloke");
        playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b", "that cunt ");
        playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", "that wanker");
        playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ", "that broad");
        playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", "me");
        playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", "me");
        playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", "thou");
        playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", "yor");
        playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", "yor");

        // Places
        playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", "Buckingham Palace");
        playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b", "cottage");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b", "field peasant");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", "lord's estate");
        playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", "the dungeon");
        playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b", "England");

        // Items
        playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", "British Stabber");
        playerMessage = playerMessage.replaceAll("(?i)\\bboots\\b", "buckled shoes");
        playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", "stacks");
        playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", "barnet");
        playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", "tophat");

        // Misc
        playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b", "bloody well yes");
        playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", "happening");
        playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", "metric system and crumpets");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", "ale");
        playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", "jig");
        playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", "bacon wankers");
        playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", "lads");
        playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", "fifty and zero");
        playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", "Englishman Jogging");
        playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b", "hath");
        playerMessage = playerMessage.replaceAll("(?i)\\blord\\b", "the Queen");
        playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", " ye olde ");
        playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", "The Queen");
        playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", "God Save the Queen");

        // Here we do British Grammar we do this last to see if we can get any
        // words not in the list above
        // but not to affect the above words

        // playerMessage = playerMessage.replaceAll("ing", "in'");

        // Set a random generic Prefix and Suffix for improved britfication

        Random generator = new Random();

        String prefix = Constants.britPrefixList.get(generator.nextInt(Constants.britPrefixList.size()));
        String suffix = Constants.britSuffixList.get(generator.nextInt(Constants.britSuffixList.size()));

        // Remove double spaces and Set the new Message

        playerMessage = playerMessage.replaceAll("  ", " ");
        event.setMessage(prefix + playerMessage + suffix);

    }

    /**
     * This function is to translate chat to ghetto
     * 
     * @param player
     *            Player object
     * @param playerMessage
     *            Player's message sent
     * @param event
     *            ASync Player Chat event from Bukkit.
     */
    public void makeGhetto(Player player, String playerMessage, AsyncPlayerChatEvent event) {
        // Up Here We Write All the Words First So they aren't later replaced
        // With the Ebonic Grammar
        // Order things So they will not mess up words ex. Farmer before Farm

        // Most common words first so these are replaced before it continues
        playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b", "da");
        playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", "whats crackin");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", "Cya");
        playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", "gotz");
        playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", " gotz ");
        playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", "dat");
        playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", "dis");
        playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b", "thang");
        playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", "ain't");
        playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", "ain't");
        playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", "bomb");
        playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", "boo boo");
        playerMessage = playerMessage.replaceAll("(?i)\\band\\b", "'n'");
        playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", "shit");
        playerMessage = playerMessage.replaceAll("(?i)\\bIm\\ssorry\\b", "my bad");
        playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", "shiznit");
        playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", "Ight");
        playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", "beef");
        playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", "dealing");
        playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", "deal");
        playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", "pimp");
        playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sto\\b", "how tha fuck to");
        playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", "pimped out");
        playerMessage = playerMessage.replaceAll("(?i)\\bany", " any muthah fuckin");
        playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", "holy mutha fuckin shit");
        playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", "dayum");
        playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", "mutha fuckin rocks");
        playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", "hollah at");
        playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", "yo");

        // Common Phrases
        playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", "whats crackin");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shimself\\b", " peel his own cap back ");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", " peel his cap back ");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", "fitna");
        playerMessage = playerMessage.replaceAll("(?i)\\bdo\\syou\\b", "does you");
        playerMessage = playerMessage.replaceAll("(?i)\\bare\\syou\\b", " is you");
        playerMessage = playerMessage.replaceAll("(?i)\\bcan\\syou\\b", "you's about to");
        playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sdo\\b", "how does");

        // Minecraft Related Terms you can be specific here
        playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", "catch a fade");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", "drop");
        playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", "Pimpmobile");
        playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", "fucked up");
        playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", "drive by");
        playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", "bling");
        playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", "ballin'");
        playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b", "give welfare to");
        playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", "juice");
        playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", "gang");
        playerMessage = playerMessage.replaceAll("(?i)\\bwood\\b", "treeshizzle");
        playerMessage = playerMessage.replaceAll("(?i)\\bsapling\\b", "tree baby");

        // Food Items
        playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", "cornbread and watermelon");
        playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", "hamhawkes");
        playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b", "Kentucky mo fuckin' fried Chicken");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", "beefshizzle");

        // Personal Addressing
        playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", "pimp ");
        playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", " play hata");
        playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", "babys mamma");
        playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b", "some nigguh");
        playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", "homie");
        playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", " baby's mama ");
        playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", " baby's daddy ");
        playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", "ho");
        playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", " any of you dumb nigguhs");

        // Pronouns
        playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", "bitch");
        playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", "nigga");
        playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", "that nigga");
        playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b", "dis bitch ");
        playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", "dat nigguh");
        playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ", "dat biatch");
        playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", "this nigguh's");
        playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", "this nigguh's");
        playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", "y'all");
        playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", "yo'ass is");
        playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", "yo'");

        // Places
        playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", "hood");
        playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b", "crib");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b", "SlaveOwner");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", "plantation");
        playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", "the brick");
        playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b", "hood");

        // Items
        playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", "strap");
        playerMessage = playerMessage.replaceAll("(?i)\\bboots\\b", "jordans");
        playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", "stacks");
        playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", "weave");
        playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", "snapback");

        // Misc
        playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", "pimped out");
        playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b", "hell yeah");
        playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", "poppin' off");
        playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", "digits");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", "Fo'ty");
        playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", "twerk");
        playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", "PoPo");
        playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", "churrin");
        playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", "fitty");
        playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", "bookin' it");
        playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b", "gotz");
        playerMessage = playerMessage.replaceAll("(?i)\\blord\\b", "lawdy");
        playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", " old-ass ");
        playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", "Black Jesus");
        playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", "Oh Lawdy");

        // Here we do Ebonic Grammar we do this last to see if we can get any
        // words not in the list above
        // but not to affect the above words

        playerMessage = playerMessage.replaceAll("ing", "in'");

        playerMessage = playerMessage.replaceAll("oth", "uth");

        playerMessage = playerMessage.replaceAll("er ", "ah ");

        playerMessage = playerMessage.replaceAll("ar ", "ah ");

        playerMessage = playerMessage.replaceAll("ore ", "o' ");

        // Set a random generic Prefix and Suffix for improved ghettofication

        String prefix = Constants.ghettoPrefixList.get(generator.nextInt(Constants.ghettoPrefixList.size()));
        String suffix = Constants.ghettoSuffixList.get(generator.nextInt(Constants.ghettoSuffixList.size()));

        // Remove double spaces and Set the new Message

        playerMessage = playerMessage.replaceAll("  ", " ");
        event.setMessage(prefix + playerMessage + suffix);
    }

    /**
     * This function is to translate chat to leetspeak
     * 
     * @param player
     *            Player object
     * @param playerMessage
     *            Player's message sent
     * @param event
     *            ASync Player Chat event from Bukkit.
     */
    public void makeLeet(Player player, String playerMessage, AsyncPlayerChatEvent event) {

        // Up Here We Write All the Words First So they aren't later replaced
        // With the Leetish Grammar
        // Order things So they will not mess up words ex. Farmer before Farm

        // Most common words first so these are replaced before it continues

        playerMessage = playerMessage.replaceAll("(?i)\\bfear\\b", "phear");
        playerMessage = playerMessage.replaceAll("(?i)\\bat\\b", "@");
        playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", "yoo");
        playerMessage = playerMessage.replaceAll("(?i)\\bhack\\b", "hax");
        playerMessage = playerMessage.replaceAll("(?i)\\bhi|hello\\b", "hai der");
        playerMessage = playerMessage.replaceAll("(?i)\\bto|two|too\\b", "2");;

        // Character Map

        playerMessage = playerMessage.replaceAll("(?i)a", "@");
        playerMessage = playerMessage.replaceAll("(?i)b", "13");
        playerMessage = playerMessage.replaceAll("(?i)c", "[");
        playerMessage = playerMessage.replaceAll("(?i)d", "[)");
        playerMessage = playerMessage.replaceAll("(?i)e", "3");
        playerMessage = playerMessage.replaceAll("(?i)f", "ph");
        playerMessage = playerMessage.replaceAll("(?i)g", "6");
        playerMessage = playerMessage.replaceAll("(?i)h", "|-|");
        playerMessage = playerMessage.replaceAll("(?i)i", "1");
        playerMessage = playerMessage.replaceAll("(?i)j", "_/");
        playerMessage = playerMessage.replaceAll("(?i)k", "|<");
        playerMessage = playerMessage.replaceAll("(?i)l", "|_");
        playerMessage = playerMessage.replaceAll("(?i)m", "/\\\\/\\\\");
        playerMessage = playerMessage.replaceAll("(?i)n", "/\\\\/");
        playerMessage = playerMessage.replaceAll("(?i)o", "0");
        playerMessage = playerMessage.replaceAll("(?i)p", "|>");
        playerMessage = playerMessage.replaceAll("(?i)q", "(,)");
        playerMessage = playerMessage.replaceAll("(?i)r", "r");
        playerMessage = playerMessage.replaceAll("(?i)s", "z");
        playerMessage = playerMessage.replaceAll("(?i)t", "+");
        playerMessage = playerMessage.replaceAll("(?i)u", "\\\\_/");
        playerMessage = playerMessage.replaceAll("(?i)v", "\\\\/");
        playerMessage = playerMessage.replaceAll("(?i)w", "\\\\/\\\\/");
        playerMessage = playerMessage.replaceAll("(?i)x", "><");
        playerMessage = playerMessage.replaceAll("(?i)y", "�");
        playerMessage = playerMessage.replaceAll("(?i)z", "z");

        // Here we do l33tish Grammar we do this last to see if we can get any
        // words not in the list above
        // but not to affect the above words

        playerMessage = playerMessage.replaceAll("(?i)cks", "x");
        playerMessage = playerMessage.replaceAll("(?i)er", "zor");
        playerMessage = playerMessage.replaceAll("(?i)or", "xor");
        playerMessage = playerMessage.replaceAll("(?i)ur", "x0l0n1u$");

        // Remove double spaces and Set the new Message

        playerMessage = playerMessage.replaceAll("  ", " ");
        event.setMessage(playerMessage);

    }

    /**
     * This function is to translate chat to pirate
     * 
     * @param player
     *            Player object
     * @param playerMessage
     *            Player's message sent
     * @param event
     *            ASync Player Chat event from Bukkit.
     */
    public void makePirate(Player player, String playerMessage, AsyncPlayerChatEvent event) {

        // Up Here We Write All the Words First So they aren't later replaced
        // With the Pirateish Grammar
        // Order things So they will not mess up words ex. Farmer before Farm

        // Most common words first so these are replaced before it continues

        playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b", "the");
        playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", "Ahoy");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", "shove off");
        playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", "havin' ");
        playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", " has ");
        playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", "that");
        playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", "this");
        playerMessage = playerMessage.replaceAll("(?i)\\bthere\\b", "thar");
        playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b", "booty");
        playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", "is nary");
        playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", "is nary");
        playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", "Ship Shape");
        playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", "blasted");
        playerMessage = playerMessage.replaceAll("(?i)\\band\\b", " and ");
        playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", "treasure");
        playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", "Aye mate");
        playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", "walkin the plank");
        playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", "bartering");
        playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", "barter");
        playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", "heave ho");
        playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", "shiny");
        playerMessage = playerMessage.replaceAll("(?i)\\bany", " any ");
        playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", "Blow me down");
        playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", "blasted");
        playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", "booty rocks");
        playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", "order");
        playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", "Oi matey");

        // Cuss Words
        playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", "rubbish");
        playerMessage = playerMessage.replaceAll("(?i)\\bbitch\\b", "landlubber");
        playerMessage = playerMessage.replaceAll("(?i)\\bfuck off\\b", "walk the plank!");
        playerMessage = playerMessage.replaceAll("(?i)\\bfucked\\b", "pillaged");
        playerMessage = playerMessage.replaceAll("(?i)\\bfucking\\b", "bloody");
        playerMessage = playerMessage.replaceAll("(?i)\\bfucker\\b", "landlubber");
        playerMessage = playerMessage.replaceAll("(?i)\\bfuck\\b", "boff");
        playerMessage = playerMessage.replaceAll("(?i)\\byour\\smom\\b", "yer wench of a mother");
        playerMessage = playerMessage.replaceAll("(?i)\\bdick\\bb", "mizzen mast");
        playerMessage = playerMessage.replaceAll("(?i)\\bpussy\\bb", "salty gash");

        // Common Phrases
        playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", "How is yer anchor hangin?");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", "send him to Davy Jones");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", "shovin off to");

        // Minecraft Related Terms you can be specific here
        playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", "have a game of fisticuffs");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", "murder");
        playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", "pirate ship");
        playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", "plundered");
        playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", "plunder");
        playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", "booty");
        playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", "rich with booty");
        playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b", "have tea and crumpets with");
        playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", "wind");
        playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", "crew");
        playerMessage = playerMessage.replaceAll("(?i)\\bwood\\b", "driftwood");

        // Food Items
        playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", "grog and seaweed");
        playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", "porkskins");
        playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b", "biscuit");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", "salted beef");

        // Personal Addressing
        playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", "landlubber ");
        playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", " mate ");
        playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", "ship whore");
        playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b", "one of you salty dogs");
        playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", "mate");
        playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", " mother ");
        playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", " father ");
        playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", "wench");
        playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", " any of you buckos");

        // Pronouns
        playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", "wench");
        playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", "landlubber");
        playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", "that sea dog");
        playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b", "that wench ");
        playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", "that landlubber");
        playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ", "that wench");
        playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", "me");
        playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", "me");
        playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", "ye");
        playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", "yer");
        playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", "yer");

        // Places
        playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", "hide out");
        playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b", "ship");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b", "landlubber");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", "landlubbers land");
        playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", "the brig");
        playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b", "The seven seas");

        // Items
        playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", "cutlass");
        playerMessage = playerMessage.replaceAll("(?i)\\bboots\\b", "peg legs");
        playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", "doubloons");
        playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", "barnet");
        playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", "pirate hat");

        // Misc
        playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b", "aye mate");
        playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", "happening");
        playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", "gibberish");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", "grog");
        playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", "jig");
        playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", "soldiers");
        playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", "lads");
        playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", "fifty and zero");
        playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", "sailing");
        playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b", "has");
        playerMessage = playerMessage.replaceAll("(?i)\\blord\\b", "Captain");
        playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", " olden ");
        playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", "Neptune");
        playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", "Poseidon's beard");

        // Here we do Piratish Grammar we do this last to see if we can get any
        // words not in the list above
        // but not to affect the above words

        playerMessage = playerMessage.replaceAll("ing", "in'");

        // Set a random generic Prefix and Suffix for improved Piratefication

        Random generator = new Random();

        String prefix = Constants.piratePrefixList.get(generator.nextInt(Constants.piratePrefixList.size()));
        String suffix = Constants.pirateSuffixList.get(generator.nextInt(Constants.pirateSuffixList.size()));

        // Remove double spaces and Set the new Message

        playerMessage = playerMessage.replaceAll("  ", " ");
        event.setMessage(prefix + playerMessage + suffix);

    }

    /**
     * This function is to translate chat to random/nonsense
     * 
     * @param player
     *            Player object
     * @param playerMessage
     *            Player's message sent
     * @param event
     *            ASync Player Chat event from Bukkit.
     */
    public void makeRandom(Player player, String playerMessage, AsyncPlayerChatEvent event) {

        // Up Here We Write All the Words First So they aren't later replaced
        // With the Ebonic Grammar
        // Order things So they will not mess up words ex. Farmer before Farm

        // Most common words first so these are replaced before it continues
        playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b", "wiggle");
        playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", "beanie baby");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", "R&B Music");
        playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", "not sure but");
        playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", " NOPE ");
        playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", "WHO?");
        playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", "that's my slave");
        playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b", "the state department");
        playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", "paranoia");
        playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", "kingdom");
        playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", "Jesus");
        playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", "A Catholic Priest");
        playerMessage = playerMessage.replaceAll("(?i)\\band\\b", "Whenever I");
        playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", "candy bars");
        playerMessage = playerMessage.replaceAll("(?i)\\bIm\\ssorry\\b", "putin");
        playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", "USSR");
        playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", "communism");
        playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", "dinosaur");
        playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", "overweight women");
        playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", "feeling");
        playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", "balls");
        playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sto\\b", "I need you");
        playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", "I may be gay");
        playerMessage = playerMessage.replaceAll("(?i)\\bany", " super bear");
        playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", "probably suicide");
        playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", "I'm dying");
        playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", "cowboys and more cowboys");
        playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", "fairy");
        playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", "why talk?");

        // Common Phrases
        playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", "fatty");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shimself\\b", "  felony assault");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", " deserved ot ");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", "nothing");
        playerMessage = playerMessage.replaceAll("(?i)\\bdo\\syou\\b", "god did it first");
        playerMessage = playerMessage.replaceAll("(?i)\\bare\\syou\\b", " darwinism of the");
        playerMessage = playerMessage.replaceAll("(?i)\\bcan\\syou\\b", "dont feed the");
        playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sdo\\b", "narrator");

        // Minecraft Related Terms you can be specific here
        playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", "fishing");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", "people");
        playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", "overweight woman");
        playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", "pumped");
        playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", "feelings release");
        playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", "syrup");
        playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", "bear food");
        playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b", "bear murder");
        playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", "forestry");
        playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", "healthcare");
        playerMessage = playerMessage.replaceAll("(?i)\\bwood\\b", "Obama");
        playerMessage = playerMessage.replaceAll("(?i)\\bsapling\\b", "Soviet");

        // Food Items
        playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", "junk trousers");
        playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", "chinaman");
        playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b", "random dwarf");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", "I get it");

        // Personal Addressing
        playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", "sunburn ");
        playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", " candle");
        playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", "wax me");
        playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b", "I guess");
        playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", "Polish");
        playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", "Frenh ");
        playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", "poor ");
        playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", "just stop");
        playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", " pennies lots of pennies");

        // Pronouns
        playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", "grenade");
        playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", "weaponry");
        playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", "fantastic");
        playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b", "bad haircut ");
        playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", "disbelief");
        playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ", "if you");
        playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", "I won't");
        playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", "he will");
        playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", "although");
        playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", "on a boat");
        playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", "next to a boat");

        // Places
        playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", "ghosts you say?");
        playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b", "feelings");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b", "no way");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", "messy theatre");
        playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", "clean that up");
        playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b", "cling clang");

        // Items
        playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", "strap");
        playerMessage = playerMessage.replaceAll("(?i)\\bboots\\b", "jordans");
        playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", "stacks");
        playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", "weave");
        playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", "snapback");

        // Misc
        playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", "bootstrap");
        playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b", "solidified");
        playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", "Han Solo");
        playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", "Gorgon");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", "Tom Cruise");
        playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", "green bear");
        playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", "godzilla");
        playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", "yes, yes I am");
        playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", "that is correct");
        playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", "can't see");
        playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b", "haven't seen her");
        playerMessage = playerMessage.replaceAll("(?i)\\blord\\b", "trusting kittycat");
        playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", " earthworm? Bake");
        playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", "outstanding");
        playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", "full moon");

        // Here we do Randomish Grammar we do this last to see if we can get any
        // words not in the list above
        // but not to affect the above words

        playerMessage = playerMessage.replaceAll("ing", "izzleing'");

        playerMessage = playerMessage.replaceAll("oth", "izoth");

        String prefix = Constants.randomPrefixList.get(generator.nextInt(Constants.randomPrefixList.size()));
        String suffix = Constants.randomSuffixList.get(generator.nextInt(Constants.randomSuffixList.size()));

        // Remove double spaces and Set the new Message

        playerMessage = playerMessage.replaceAll("  ", " ");
        event.setMessage(prefix + playerMessage + suffix);

    }

    /**
     * This function is to translate chat to rich/classy
     * 
     * @param player
     *            Player object
     * @param playerMessage
     *            Player's message sent
     * @param event
     *            ASync Player Chat event from Bukkit.
     */
    public void makeRich(Player player, String playerMessage, AsyncPlayerChatEvent event) {

        // Up Here We Write All the Words First So they aren't later replaced
        // With the Classyish Grammar
        // Order things So they will not mess up words ex. Farmer before Farm

        // Most common words first so these are replaced before it continues

        playerMessage = playerMessage.replaceAll("(?i)\\bthe\\b", "the");
        playerMessage = playerMessage.replaceAll("(?i)\\bhello\\b", "salutations");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoodbye\\b", "farewell");
        playerMessage = playerMessage.replaceAll("(?i)\\bhave\\b", "possess");
        playerMessage = playerMessage.replaceAll("(?i)\\bhas\\b", " has ");
        playerMessage = playerMessage.replaceAll("(?i)\\bthat\\b", "that");
        playerMessage = playerMessage.replaceAll("(?i)\\bthis\\b", "this");
        playerMessage = playerMessage.replaceAll("(?i)\\bthing\\b", "object");
        playerMessage = playerMessage.replaceAll("(?i)\\bisnt\\b", "is not");
        playerMessage = playerMessage.replaceAll("(?i)\\barent\\b", "are not");
        playerMessage = playerMessage.replaceAll("(?i)\\bgood\\b", "refined");
        playerMessage = playerMessage.replaceAll("(?i)\\bbad\\b", "unsuitable");
        playerMessage = playerMessage.replaceAll("(?i)\\band\\b", "and furthermore ");
        playerMessage = playerMessage.replaceAll("(?i)\\bstuff\\b", "stocks");
        playerMessage = playerMessage.replaceAll("(?i)\\bIm\\ssorry\\b", "I apologize");
        playerMessage = playerMessage.replaceAll("(?i)\\balright\\b", "alright");
        playerMessage = playerMessage.replaceAll("(?i)\\bproblem\\b", "quandary");
        playerMessage = playerMessage.replaceAll("(?i)\\bselling\\b", "trading");
        playerMessage = playerMessage.replaceAll("(?i)\\bsell\\b", "trade");
        playerMessage = playerMessage.replaceAll("(?i)\\bwork\\b", "invest");
        playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sto\\b", "how to");
        playerMessage = playerMessage.replaceAll("(?i)\\bnew\\b", "modern");
        playerMessage = playerMessage.replaceAll("(?i)\\bany", " any");
        playerMessage = playerMessage.replaceAll("(?i)\\bwow\\b", "marvelous");
        playerMessage = playerMessage.replaceAll("(?i)\\bdamn\\b", "curses");
        playerMessage = playerMessage.replaceAll("(?i)\\bore\\b", "raw materials");
        playerMessage = playerMessage.replaceAll("(?i)\\btell\\bb", "inform");
        playerMessage = playerMessage.replaceAll("(?i)\\bhey\\bb", "greetings");

        // Cuss Words
        playerMessage = playerMessage.replaceAll("(?i)\\bshit\\b", "rubbish");
        playerMessage = playerMessage.replaceAll("(?i)\\bbitch\\b", "classy escort");
        playerMessage = playerMessage.replaceAll("(?i)\\bfuck off\\b", "youre fired");
        playerMessage = playerMessage.replaceAll("(?i)\\bfucked\\b", "boffed");
        playerMessage = playerMessage.replaceAll("(?i)\\bfucking\\b", "bloody");
        playerMessage = playerMessage.replaceAll("(?i)\\bfucker\\b", "impoverished individual");
        playerMessage = playerMessage.replaceAll("(?i)\\bfuck\\b", "fancily fuck");
        playerMessage = playerMessage.replaceAll("(?i)\\byour\\smom\\b", "your working-class mother");
        playerMessage = playerMessage.replaceAll("(?i)\\bdick\\bb", "assistant");
        playerMessage = playerMessage.replaceAll("(?i)\\bpussy\\bb", "coitus");

        // Common Phrases
        playerMessage = playerMessage.replaceAll("(?i)\\bwhats\\sup\\b", "How are you my good man?");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\shim\\b", "put him out of business");
        playerMessage = playerMessage.replaceAll("(?i)\\bgoing\\sto\\b", "going to");
        playerMessage = playerMessage.replaceAll("(?i)\\bdo\\syou\\b", "you");
        playerMessage = playerMessage.replaceAll("(?i)\\bare\\syou\\b", "are you");
        playerMessage = playerMessage.replaceAll("(?i)\\bcan\\syou\\b", "Ill pay you to");
        playerMessage = playerMessage.replaceAll("(?i)\\bhow\\sdo\\b", "how does");

        // Minecraft Related Terms you can be specific here
        playerMessage = playerMessage.replaceAll("(?i)\\bfight\\b", "have a game of fisticuffs");
        playerMessage = playerMessage.replaceAll("(?i)\\bkill\\b", "fire");
        playerMessage = playerMessage.replaceAll("(?i)\\bairship\\b", "limosine");
        playerMessage = playerMessage.replaceAll("(?i)\\bgriefed\\b", "liquidated");
        playerMessage = playerMessage.replaceAll("(?i)\\battack\\b", "have a gentlemen's argument");
        playerMessage = playerMessage.replaceAll("(?i)\\bgold\\b", "pocket change");
        playerMessage = playerMessage.replaceAll("(?i)\\brich\\b", "wealthy");
        playerMessage = playerMessage.replaceAll("(?i)\\bfeed\\b", "have champagne and cavier");
        playerMessage = playerMessage.replaceAll("(?i)\\bpower\\b", "wealth");
        playerMessage = playerMessage.replaceAll("(?i)\\bfaction\\b", "corporation");

        // Food Items
        playerMessage = playerMessage.replaceAll("(?i)\\bfood\\b", "entree");
        playerMessage = playerMessage.replaceAll("(?i)\\bpork\\b", "pork and lobster");
        playerMessage = playerMessage.replaceAll("(?i)\\bchicken\\b", "chicken a la mode");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeef\\b", "steak");

        // Personal Addressing
        playerMessage = playerMessage.replaceAll("(?i)\\bperson\\b", "laborer");
        playerMessage = playerMessage.replaceAll("(?i)\\bcitizen\\b", "peasant");
        playerMessage = playerMessage.replaceAll("(?i)\\bgirlfriend\\b", "mistress");
        playerMessage = playerMessage.replaceAll("(?i)\\bsomeone\\b", "some ugly twit");
        playerMessage = playerMessage.replaceAll("(?i)\\bfriend\\b", "board member");
        playerMessage = playerMessage.replaceAll("(?i)\\bmom\\b", "mother");
        playerMessage = playerMessage.replaceAll("(?i)\\bdad\\b", "father");
        playerMessage = playerMessage.replaceAll("(?i)\\bwhore\\b", "escort");
        playerMessage = playerMessage.replaceAll("(?i)\\banyone\\b", "any of you common people");

        // Pronouns
        playerMessage = playerMessage.replaceAll("(?i)\\bgirl\\b", "lady");
        playerMessage = playerMessage.replaceAll("(?i)\\bguy\\b", "gentleman");
        playerMessage = playerMessage.replaceAll("(?i)\\bhe\\b ", "the gentleman");
        playerMessage = playerMessage.replaceAll("(?i)\\bshe\\b", "the lady");
        playerMessage = playerMessage.replaceAll("(?i)\\bhim\\b ", "him");
        playerMessage = playerMessage.replaceAll("(?i)\\bher\\b ", "her");
        playerMessage = playerMessage.replaceAll("(?i)\\bmy\\b", "my");
        playerMessage = playerMessage.replaceAll("(?i)\\bme\\b", "me");
        playerMessage = playerMessage.replaceAll("(?i)\\byou\\b", "you");
        playerMessage = playerMessage.replaceAll("(?i)\\byoure\\b", "you, my good man, are");
        playerMessage = playerMessage.replaceAll("(?i)\\byours\\b", "mine");
        playerMessage = playerMessage.replaceAll("(?i)\\byour\\b", "my");

        // Places
        playerMessage = playerMessage.replaceAll("(?i)\\bbase\\b", "Wall Street");
        playerMessage = playerMessage.replaceAll("(?i)\\bhouse\\b", "mansion");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarmer\\b", "laborer");
        playerMessage = playerMessage.replaceAll("(?i)\\bfarm\\b", "estate");
        playerMessage = playerMessage.replaceAll("(?i)\\bjail\\b", "vacation home");
        playerMessage = playerMessage.replaceAll("(?i)\\bworld\\b", "my portfolio");

        // Items
        playerMessage = playerMessage.replaceAll("(?i)\\bsword\\b", "sabre");
        playerMessage = playerMessage.replaceAll("(?i)\\bboot\\b", "loafer");
        playerMessage = playerMessage.replaceAll("(?i)\\bmoney\\b", "currency");
        playerMessage = playerMessage.replaceAll("(?i)\\bhair\\b", "locks");
        playerMessage = playerMessage.replaceAll("(?i)\\bhelmet\\b", "tophat");

        // Misc
        playerMessage = playerMessage.replaceAll("(?i)\\bof\\scourse\\b", "very good sir");
        playerMessage = playerMessage.replaceAll("(?i)\\bhappening\\b", "happening");
        playerMessage = playerMessage.replaceAll("(?i)\\bnumber\\b", "quote");
        playerMessage = playerMessage.replaceAll("(?i)\\bbeer\\b", "champagne");
        playerMessage = playerMessage.replaceAll("(?i)\\bdance\\b", "waltz");
        playerMessage = playerMessage.replaceAll("(?i)\\bpolice\\b", "subordinates");
        playerMessage = playerMessage.replaceAll("(?i)\\bchildren\\b", "lads");
        playerMessage = playerMessage.replaceAll("(?i)\\bfifty\\b", "fifty and zero");
        playerMessage = playerMessage.replaceAll("(?i)\\brunning\\b", "strolling");
        playerMessage = playerMessage.replaceAll("(?i)\\bgot\\b", "in possession");
        playerMessage = playerMessage.replaceAll("(?i)\\blord\\b", "Hedgefund Manager");
        playerMessage = playerMessage.replaceAll("(?i)\\bold\\b", "antique");
        playerMessage = playerMessage.replaceAll("(?i)\\bjesus\\b", "CEO");
        playerMessage = playerMessage.replaceAll("(?i)\\bchrist\\b", "Money");

        // Here we do Classyish Grammar we do this last to see if we can get any
        // words not in the list above
        // but not to affect the above words

        // playerMessage = playerMessage.replaceAll("ing", "in'");

        // Set a random generic Prefix and Suffix for improved Classyfication

        Random generator = new Random();

        String prefix = Constants.richPrefixList.get(generator.nextInt(Constants.richPrefixList.size()));
        String suffix = Constants.richSuffixList.get(generator.nextInt(Constants.richSuffixList.size()));

        // Remove double spaces and Set the new Message

        playerMessage = playerMessage.replaceAll("  ", " ");
        event.setMessage(prefix + playerMessage + suffix);

    }

    /**
     * This function is to translate chat to smileys
     * 
     * @param player
     *            Player object
     * @param playerMessage
     *            Player's message sent
     * @param event
     *            ASync Player Chat event from Bukkit.
     */
    public void makeSmiley(Player player, String playerMessage, AsyncPlayerChatEvent event) {

        // A list of simple and common smileys that we make awesome

        playerMessage = playerMessage.replaceAll("(?i)\\bD:\\b", "(ㆆ▃ㆆ)");
        playerMessage = playerMessage.replaceAll("(?i)\\b\\(:\\b", "＼(＾O＾)／");
        playerMessage = playerMessage.replaceAll("(?i)\\b\\):\\b", "(╥﹏╥)");
        playerMessage = playerMessage.replaceAll("(?i)\\broyal baby\\b", "⁽⁽ :-)[▓▓] ლ(ö◡ö ლ)");
        playerMessage = playerMessage.replaceAll("(?i)\\bdongers\\b", "ヽ༼ຈل͜ຈ༽ﾉ");
        playerMessage = playerMessage.replaceAll("(?i)\\bddos\\b", "(۶ૈ ᵒ̌ Дᵒ̌)۶ૈ=͟͟͞͞ ⌨");
        playerMessage = playerMessage.replaceAll("(?i)\\bdeal with it\\b", "(•_•) ( •_•)>⌐■-■ (⌐■_■)");
        playerMessage = playerMessage.replaceAll("(?i)\\by u no\\b", "ლ(ಠ益ಠლ)");
        playerMessage = playerMessage.replaceAll("(?i)\\bdisapprove\\b", "ಠ_ಠ");
        playerMessage = playerMessage.replaceAll("(?i)\\bhappy table\\b", "┻━┻ ︵ ლ(⌒-⌒ლ)");
        playerMessage = playerMessage.replaceAll("(?i)\\bPooh\\b", "ʕ •́؈•̀)");
        playerMessage = playerMessage.replaceAll("(?i)\\bfish\\b", "<º))))><");
        playerMessage = playerMessage.replaceAll("(?i)\\bnixon\\b", "✌(-‿-)✌");
        playerMessage = playerMessage.replaceAll("(?i)\\bkoala\\b", "ʕ •ᴥ•ʔ");
        playerMessage = playerMessage.replaceAll("(?i)\\balien finger\\b", "┌∩┐(◣_◢)┌∩┐");
        playerMessage = playerMessage.replaceAll("(?i)\\bshrug\\b", "¯\\_(ツ)_/¯");
        playerMessage = playerMessage.replaceAll("(?i)\\bbear table\\b", "ʕノ•ᴥ•ʔノ ︵ ┻━┻");
        playerMessage = playerMessage.replaceAll("(?i)\\bbear table\\b", "(/ .□.)\\ ︵╰(゜Д゜)╯︵ /(.□. \\)");
        playerMessage = playerMessage.replaceAll("(?i)\\bspy\\b", "┬┴┬┴┤(･_├┬┴┬┴");
        playerMessage = playerMessage.replaceAll("(?i)\\bbro fist\\b", "(ó ì_í)=óò=(ì_í ò)");
        playerMessage = playerMessage.replaceAll("(?i)\\bpropose\\b", "(   ° ᴗ°)~ð  (/❛o❛\\)");
        playerMessage = playerMessage.replaceAll("(?i)\\btasty\\b", "(っ˘ڡ˘ς)");
        playerMessage = playerMessage.replaceAll("(?i)\\bstunner\\b", "(⌐■_■)");
        playerMessage = playerMessage.replaceAll("(?i)\\bsparklez\\b", "☆.。.:*・°☆.。.:*・°☆.。.:*・°☆.。.:*・°☆");
        playerMessage = playerMessage.replaceAll("(?i)\\bgun\\b", "︻デ═一");
        playerMessage = playerMessage.replaceAll("(?i)\\bfinger\\\b", "( ︶︿︶)_╭∩╮");
        playerMessage = playerMessage.replaceAll("(?i)\\byour right\\b", "(☞ﾟ∀ﾟ)☞");
        playerMessage = playerMessage.replaceAll("(?i)\\bjust saying\\b", "¬_¬");
        playerMessage = playerMessage.replaceAll("(?i)\\bwizard\\b", "(∩｀-´)⊃━☆ﾟ.*･｡ﾟ");
        playerMessage = playerMessage.replaceAll("(?i)\\bthink\\b", "♒((⇀‸↼))♒");
        playerMessage = playerMessage.replaceAll("(?i)\\bnazi star\\b", "（ -.-）ノ-=≡≡卍");
        playerMessage = playerMessage.replaceAll("(?i)\\bping pong\\b", "ヽ(^o^)ρ┳┻┳°σ(^o^)/");

        // Set the New Message

        playerMessage = playerMessage.replaceAll("  ", " ");
        event.setMessage(playerMessage);

    }

}
