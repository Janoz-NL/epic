package com.janoz.epic;

import com.janoz.discord.VoiceContext;
import io.quarkus.runtime.Startup;
import io.smallrye.common.annotation.Identifier;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;
import jakarta.ws.rs.Produces;

@ApplicationScoped
public class Producer {

    @Inject VoiceConfig voiceConfig;

    @Produces
    @Startup
    @Default
    @Identifier("voiceContext")
    public VoiceContext constructVoiceContext() {
        if (voiceConfig.mocked()) return VoiceContext.builder().asMock().build();
        VoiceContext context = VoiceContext.builder()
                .token(voiceConfig.token())
                .build();
        context.getSampleService().readSamples(voiceConfig.samples());
        return context;
    }
}
