package com.janoz.epic;

import com.janoz.discord.VoiceContext;
import com.janoz.discord.domain.VoiceChannel;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class EpicResource {

    public EpicResource(VoiceContext voiceContext, VoiceConfig voiceConfig) {
        this.voiceContext = voiceContext;
        this.voiceConfig = voiceConfig;
    }

    private final VoiceContext voiceContext;
    private final VoiceConfig voiceConfig;


    @GET
    @Path("/epic")
    @Produces(MediaType.TEXT_PLAIN)
    public String epic() {
        VoiceChannel voiceChannel = voiceContext.getDiscordService().getVoiceChannel(voiceConfig.channel());
        voiceContext.getDiscordService().play("epic-tadam.mp3", voiceChannel);
        return "Epic \uD83E\uDD19";
    }

}
