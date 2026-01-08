FROM eclipse-temurin:8-jre

ARG SUBSONIC_VERSION=6.1.6
ARG SUBSONIC_URL=https://downloads.sourceforge.net/project/subsonic/subsonic/${SUBSONIC_VERSION}/subsonic-${SUBSONIC_VERSION}-standalone.tar.gz

# User non-root (sécurité)
RUN useradd -m -u 10001 -s /usr/sbin/nologin subsonic

RUN apt-get update && apt-get install -y \
    curl ca-certificates tar \
 && rm -rf /var/lib/apt/lists/*

WORKDIR /app

RUN mkdir -p /app/standalone \
 && curl -fsSL "$SUBSONIC_URL" -o /tmp/subsonic.tar.gz \
 && tar -xzf /tmp/subsonic.tar.gz -C /app/standalone \
 && rm /tmp/subsonic.tar.gz

RUN mkdir -p /data /music \
 && chown -R subsonic:subsonic /app /data /music

COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

USER subsonic

EXPOSE 4040

VOLUME ["/data", "/music"]

ENTRYPOINT ["/entrypoint.sh"]
