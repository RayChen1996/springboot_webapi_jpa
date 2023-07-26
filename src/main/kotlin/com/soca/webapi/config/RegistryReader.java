package com.soca.webapi.config;

import java.util.prefs.Preferences;

public class RegistryReader {
    public static String readDatabasePathFromRegistry() {
        Preferences preferences = Preferences.userRoot().node("Software\\SOCA\\Web");
        return preferences.get("Path", "C:/SOCA/") + "DATABASE/SOCAWEBDB.FDB";
    }
}
