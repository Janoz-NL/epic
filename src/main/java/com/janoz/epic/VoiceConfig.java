package com.janoz.epic;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "voice")
public interface VoiceConfig {
    String token();
    Long channel();
    String samples();
    boolean mocked();
}
