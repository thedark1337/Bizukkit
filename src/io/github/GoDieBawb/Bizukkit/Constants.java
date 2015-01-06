package io.github.GoDieBawb.Bizukkit;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author GoDieBawb
 * @author Alex 'Thedark1337' Pham
 *
 */
public final class Constants {
    private Constants() {
    }

    /*
     * Language Constants
     */
    
    public final static String british = "british";
    public final static String l33t = "l33t";
    public final static String ghetto = "ghetto";
    public final static String nonsense = "nonsense";
    public final static String nSpeaking = " is no longer speaking ";
    public final static String pirate = "pirate";
    public final static String rich = "rich";
    public final static String smiley = "smiley";
    public final static String speaking = " is now speaking ";

    /*
     * Bizukkit Permissions
     */
    public final static String bPerm = "bizukit.british";
    public final static String gPerm = "bizukkit.ghetto";
    public final static String lPerm = "bizukkit.l33t";
    public final static String nPerm = "bizukkit.nonsense";
    public final static String pPerm = "bizukkit.pirate";
    public final static String rPerm = "bizukkit.rich";
    public final static String sPerm = "bizukkit.smiley";

    public final static String noPermission = "You Don't have permission to do this!";

    public final static ArrayList<String> languages = new ArrayList<String>(Arrays.asList("ghetto", "rich", "british", "l33t", "pirate", "nonsense", "smiley"));

    /*
     * Prefixes And Suffixes
     */

    public final static ArrayList<String> britPrefixList = new ArrayList<String>(Arrays.asList("Cheerio poppins  ", "Oi mate ", "Sir, ", "Oi Wankers ",
            "Blimey  ", "Tea and wot not ", "save the queen mate and "));
    public final static ArrayList<String> britSuffixList = new ArrayList<String>(Arrays.asList(" pip pip cherrio and wot not", " for the queen",
            " got it mate?", " mate", " bugger", " pish posh and a cup of tea", " roight bloke?", " Monty Python", "Aye Govna'  "));

    public final static ArrayList<String> ghettoPrefixList = new ArrayList<String>(Arrays.asList("What up ", "My niggahs ", "Yo bitches ", "Aye niggahs ",
            "Aye ", "Yo pimps ", "Hey ya'll ", "Wut up yo "));
    public final static ArrayList<String> ghettoSuffixList = new ArrayList<String>(Arrays.asList(" put dat on yo toast", " muthah fuckah", " in this bitch",
            " my niggah", " niggah", " ya dig?", " aight?"));
    public final static ArrayList<String> piratePrefixList = new ArrayList<String>(Arrays.asList("Arrgg mateys  ", "Land Ho ", "Aye Captain ",
            "Shiver me Timbers! ", "land lubbers ", "Avast ye scurvy dogs  ", "Aye sea dogs ", "Ahoy mateys! "));
    public final static ArrayList<String> pirateSuffixList = new ArrayList<String>(Arrays.asList(" or you'll be walkin' the plank!", " before we set sail!",
            " me hearties", " matey", " ye scurvy dog", " or I'll have your booty", " Starboard!", " Port Side", "swab the decks!  "));
    public final static ArrayList<String> randomPrefixList = new ArrayList<String>(Arrays.asList("Fiddle Faddle Bitch ", "Monkey Bats ", "GO DIE ",
            "LISTEN UP ", "I have a drinking problem and ", "Sometimes I ", "I CAN'T STOP ", "SOCK IT TO ME ", "sometimes I ", "because you always ",
            "if not then ", "can I really ", "my favorite STD is "));
    public final static ArrayList<String> randomSuffixList = new ArrayList<String>(Arrays.asList(" I'd eat it", " KEEP IT", " ITS FREE",
            " it's hard sometimes", " because it keeps me off drugs", " is how I got AIDS", " since you HAD to know", " whoah buddy... quit hittin on me",
            " only if you wer black though", " is my main fantasy"));
    public final static ArrayList<String> richPrefixList = new ArrayList<String>(Arrays.asList("Tell my accountant  ", "The market is up and ",
            "Excuse me Sir, ", "Fetch me my yacht and ", "Good day sir  ", "Hello my good man, "));
    public final static ArrayList<String> richSuffixList = new ArrayList<String>(Arrays.asList("Tell my accountant  ", " and send one million to the railroad",
            " and a glass of champagne", " then purchase me a poor person", " and sell my stocks", " and fire my employees", " and check my portfolio",
            " my good man", " then call my broker", " then a round of polo"));
}
