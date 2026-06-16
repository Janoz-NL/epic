# EPIC

Have you ever executed a curl command and thought, *"Man, that web request was so monumental it deserved a Hollywood-grade sound effect"*?

No? Well, too bad, because it's happening anyway.

**Epic** is a lightweight, hyper-focused Discord bot built for one glorious purpose: to sit in a voice channel and blast an absolutely epic sound effect the exact millisecond you hit it with an HTTP request. Hook it up to your CI/CD pipelines, your smart doorbell, or just trigger it manually when you finally get your code to compile.

## Features

* **Zero Bloat:** No commands, no configuration menus, no AI features. Just pure, unadulterated audio satisfaction.
* **Webhook Triggered:** If it can send an HTTP call, it can make your Discord channel shake.
* **Instant Gratification:** Low latency, high impact.

## Setup & Environment Variables

To get this sonic masterpiece running, you need to feed it exactly two environment variables. No more, no less.

Drop these into your `.env` file or export them in your environment:

| Variable | Description | Example |
| --- | --- | --- |
| `VOICE.TOKEN` | Your Discord Bot Token from the Developer Portal. | `MTA5ODc2NTQzMjE...` |
| `VOICE.CHANNEL` | The exact ID of the voice channel the bot should haunt. | `112233445566778899` |

> ⚠️ **Note:** Make sure your bot has "Connect" and "Speak" permissions in the designated voice channel, otherwise it'll just sit there awkwardly in silence.

## Running with Docker

Because everything is better in a container. You can spin up this bot in seconds using Docker. Just pass your environment variables in the `docker run` command:

```bash
docker run -d \
  --name epic-boom-box \
  -e VOICE.TOKEN="your_discord_bot_token" \
  -e VOICE.CHANNEL="your_voice_channel_id" \
  -p 8080:8080 \
  your-docker-username/epic:latest

```

This will run the bot in detached mode (`-d`), map port `8080` so you can hit it with your HTTP calls, and automatically connect it to your Discord channel.

## How to Trigger the Epicness

Once the bot is online and sitting in your voice channel, you can trigger the sound by firing an HTTP request to your application's endpoint.

```bash
curl -X GET http://localhost:8080/epic

```

*(Replace the URL with wherever your bot application is hosted!)*

---

## Contributing

Got an even more epic sound effect? Found a way to shave 2 milliseconds off the audio playback latency? Feel free to open an issue or submit a pull request.

Let there be sound.
