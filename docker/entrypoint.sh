#!/usr/bin/env sh
set -eu

export SUBSONIC_HOME="/data"
export SUBSONIC_DEFAULT_MUSIC_FOLDER="/music"

# Force Subsonic à écouter sur toutes les interfaces (Docker friendly)
# --host est supporté par le script Subsonic. :contentReference[oaicite:1]{index=1}
/app/standalone/subsonic.sh --host=0.0.0.0 --port=4040

# Garde le conteneur en foreground
touch /data/subsonic_sh.log
exec tail -F /data/subsonic_sh.log
