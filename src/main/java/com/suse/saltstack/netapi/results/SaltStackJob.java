package com.suse.saltstack.netapi.results;

import java.util.List;

public class SaltStackJob {

    private String jid;
    private List<String> minions;

    public String getJid() {
        return jid;
    }

    public List<String> getMinions() {
        return minions;
    }
}
